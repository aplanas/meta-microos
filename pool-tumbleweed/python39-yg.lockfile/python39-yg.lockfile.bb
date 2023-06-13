SUMMARY = "Lockfile object with timeouts and context manager"
DESCRIPTION = "A FileLock class that implements a context manager with timeouts on top \
of zc.lockfile, an excellent, cross-platorm implementation of file locking."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python39-yg.lockfile-2.3-1.10.noarch.rpm"
RPM_HASH = "328c984e3f6f52907b476169a28c9903b88034ad609ae67ffe8d99c1e89e6f369df31d71650b6ed708c6cd139fb21e777c0392bedb872f0d80b299d077e1e873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(yg.lockfile) \
python39-yg.lockfile \
python3dist(yg.lockfile)"

RDEPENDS:${PN} += "python(abi) \
python39-jaraco.functools \
python39-tempora \
python39-zc.lockfile"

inherit rpm
