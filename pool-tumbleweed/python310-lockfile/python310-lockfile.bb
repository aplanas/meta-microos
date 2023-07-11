SUMMARY = "Platform-independent file locking module"
DESCRIPTION = "The lockfile package exports a LockFile class which provides a simple API for \
locking files.  Unlike the Windows msvcrt.locking function, the fcntl.lockf \
and flock functions, and the deprecated posixfile module, the API is \
identical across both Unix (including Linux and Mac) and Windows platforms. \
The lock mechanism relies on the atomic nature of the link (on Unix) and \
mkdir (on Windows) system calls.  An implementation based on SQLite is also \
provided, more as a demonstration of the possibilities it provides than as \
production-quality code."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "python310-lockfile-0.12.2-3.3.noarch.rpm"
RPM_HASH = "38ffd808eb3e0bd33ea51546d9f3c1da9b9e7053fab65b177d9aba069cdee31f2034209b1e2795ea1150abad7838d6384507695ca3800bc2b0dc71430287e342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lockfile \
python310-lockfile \
python3dist-lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
