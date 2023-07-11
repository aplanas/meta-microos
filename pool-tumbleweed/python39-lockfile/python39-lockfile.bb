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

RPM_NAME = "python39-lockfile-0.12.2-3.3.noarch.rpm"
RPM_HASH = "da496df788589338307912df32b91a4e0dddf070436a75b4f5a4c3390890ea1434626ed900159cab8147fd821888e50b9197a81092bf5b7615309eae98319db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lockfile \
python39-lockfile \
python3dist-lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
