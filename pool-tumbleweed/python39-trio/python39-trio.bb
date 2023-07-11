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

RPM_NAME = "python39-trio-0.22.0-2.3.noarch.rpm"
RPM_HASH = "3d5a58551601923e4cf0b84b6f585889649c72f47cb9d5746cbf5a884c055517b04f90e4b0401c3683f53974d6fc8d4a2eceb7f2716364792cbd7cad82567e37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-trio \
python39-trio \
python3dist-trio"

RDEPENDS:${PN} += "python-abi \
python39-async-generator \
python39-attrs \
python39-exceptiongroup \
python39-idna \
python39-outcome \
python39-sniffio \
python39-sortedcontainers"

inherit rpm
