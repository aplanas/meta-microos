SUMMARY = "Python async/await-native I/O library"
DESCRIPTION = "The Trio project produces an async/await-native I/O library for \
Python. Like all async libraries, its main purpose is to help write \
programs that do multiple things at the same time with parallelized \
I/O, such as a web spider that wants to fetch lots of pages in \
parallel, a web server that needs to juggle lots of downloads and \
websocket connections at the same time, a process supervisor \
monitoring multiple subprocesses. Compared to other libraries, Trio \
has an obsessive focus on usability and correctness."
LICENSE = "Apache-2.0 | MIT"

PV = "0.22.0"

RPM_NAME = "python310-trio-0.22.0-2.3.noarch.rpm"
RPM_HASH = "02bc097fe79410b9051407e8a5abc10502aa88f80dda88173cb52c6ff51e29ddca492dd03834379d4fd23373635d21da722fd7b7aa39af4a248013c5a5156238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-trio \
python310-trio \
python3dist-trio"

RDEPENDS:${PN} += "python-abi \
python310-async-generator \
python310-attrs \
python310-exceptiongroup \
python310-idna \
python310-outcome \
python310-sniffio \
python310-sortedcontainers"

inherit rpm
