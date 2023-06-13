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

RPM_NAME = "python311-trio-0.22.0-2.1.noarch.rpm"
RPM_HASH = "1b4fb18ad91c591d38913b4aeaeb588f436390a4e9c0ab9c1de372ed0b92be1edba180e586874fd8a62248d6ce7cb585470de7138107941d831a5dabb3909902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(trio) \
python311-trio \
python3dist(trio)"

RDEPENDS:${PN} += "python(abi) \
python311-async_generator \
python311-attrs \
python311-idna \
python311-outcome \
python311-sniffio \
python311-sortedcontainers"

inherit rpm
