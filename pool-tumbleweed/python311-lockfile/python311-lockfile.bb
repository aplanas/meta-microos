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

RPM_NAME = "python311-lockfile-0.12.2-3.1.noarch.rpm"
RPM_HASH = "44dfd52a252d6e14c20792ac5b37279b832b45aed25e5445a82dc412f56fb5f3a28741ed34f5e063b16585564d2685ccc9cad9ea9fe22759eff066c470831e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-lockfile \
python311-lockfile \
python3dist-lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
