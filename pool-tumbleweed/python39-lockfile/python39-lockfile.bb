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

RPM_NAME = "python39-lockfile-0.12.2-3.1.noarch.rpm"
RPM_HASH = "b9ed86811111aae1d1d3334e326bf939971019a5eb9556ccd2168feeb513075b24a6d7facc4e1626e51f39ad59c47abb34555e2d7622a0c6418fbefe206a38a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lockfile \
python39-lockfile \
python3dist-lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
