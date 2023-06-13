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

RPM_NAME = "python39-trio-0.22.0-2.1.noarch.rpm"
RPM_HASH = "5004de8c213afa19c1519d68b28bb53aa888a873a1033904071901c900df452b26942d1ae639c2708361cf04e8a6d60de23cb2dfa63cfd468a923164e5e47aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(trio) \
python39-trio \
python3dist(trio)"

RDEPENDS:${PN} += "python(abi) \
python39-async_generator \
python39-attrs \
python39-exceptiongroup \
python39-idna \
python39-outcome \
python39-sniffio \
python39-sortedcontainers"

inherit rpm
