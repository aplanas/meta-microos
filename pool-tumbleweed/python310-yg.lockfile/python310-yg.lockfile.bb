SUMMARY = "Lockfile object with timeouts and context manager"
DESCRIPTION = "A FileLock class that implements a context manager with timeouts on top \
of zc.lockfile, an excellent, cross-platorm implementation of file locking."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python310-yg.lockfile-2.3-1.12.noarch.rpm"
RPM_HASH = "84f9044d0bf0145e2f61c3d859af160656bc7723c949bd189a9963a43c6191bdbc24fbc0da8fa4cef379fa8c1b7b52b76e0bab22b90fafce1d49510000d4f219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yg.lockfile \
python310-yg.lockfile \
python3dist-yg.lockfile"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.functools \
python310-tempora \
python310-zc.lockfile"

inherit rpm
