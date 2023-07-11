SUMMARY = "Lockfile object with timeouts and context manager"
DESCRIPTION = "A FileLock class that implements a context manager with timeouts on top \
of zc.lockfile, an excellent, cross-platorm implementation of file locking."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python311-yg.lockfile-2.3-1.12.noarch.rpm"
RPM_HASH = "ceeded6175bc0194d1e8acc06c22af71d98d5948468bd6cf8d97b6690d5ce6afc3cb40b63f896ce4aad4e3591169e0ea931ffedf05ab9395f47d1fa1e832c773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yg.lockfile \
python3.11dist-yg.lockfile \
python311-yg.lockfile \
python3dist-yg.lockfile"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.functools \
python311-tempora \
python311-zc.lockfile"

inherit rpm
