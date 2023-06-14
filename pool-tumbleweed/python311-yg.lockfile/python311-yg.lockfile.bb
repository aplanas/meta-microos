SUMMARY = "Lockfile object with timeouts and context manager"
DESCRIPTION = "A FileLock class that implements a context manager with timeouts on top \
of zc.lockfile, an excellent, cross-platorm implementation of file locking."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python311-yg.lockfile-2.3-1.10.noarch.rpm"
RPM_HASH = "a0d6c622eb90879ae5a655a2e66f5954cffccb6cbc1c1f28666ee283ca1dc0a5e947acd0e6a00d475d3d700a58da25d8a968a293ff968b2a700e7b1503b3b1b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-yg.lockfile \
python311-yg.lockfile \
python3dist-yg.lockfile"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.functools \
python311-tempora \
python311-zc.lockfile"

inherit rpm
