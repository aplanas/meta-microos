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

RPM_NAME = "python311-trio-0.22.0-2.3.noarch.rpm"
RPM_HASH = "ed970930e55b2ab036ee84769da097e57f89c31244f03db1d49add92ebdba0bb986de27eb62f3c6bbef937c49e1fee12c0b6bb29f368ae02097e680fafc340ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trio \
python3.11dist-trio \
python311-trio \
python3dist-trio"

RDEPENDS:${PN} += "python-abi \
python311-async-generator \
python311-attrs \
python311-idna \
python311-outcome \
python311-sniffio \
python311-sortedcontainers"

inherit rpm
