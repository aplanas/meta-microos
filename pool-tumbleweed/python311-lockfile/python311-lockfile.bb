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

RPM_NAME = "python311-lockfile-0.12.2-3.3.noarch.rpm"
RPM_HASH = "fcb359103a40c8f4e10ebb49513dd3efaaf1e6c3eded441ceb8c35b4223d37595fadaba4f1d8afe87bc805a1ef7a7bbec83182b8d4a2926ec4975609f811d109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lockfile \
python3.11dist-lockfile \
python311-lockfile \
python3dist-lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
