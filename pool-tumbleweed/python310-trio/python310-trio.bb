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

RPM_NAME = "python310-trio-0.22.0-2.1.noarch.rpm"
RPM_HASH = "df91443567fa97db04eb1955c711c0c3c140fda48c83b2a977c81100d1a477c43df5bf1c98dc12a0e90ce8dd2c9d86a790116f0fa60397e559d99536edfc67eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trio \
python3.10dist-trio \
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
