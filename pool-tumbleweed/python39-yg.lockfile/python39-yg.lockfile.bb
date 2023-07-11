SUMMARY = "Lockfile object with timeouts and context manager"
DESCRIPTION = "A FileLock class that implements a context manager with timeouts on top \
of zc.lockfile, an excellent, cross-platorm implementation of file locking."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python39-yg.lockfile-2.3-1.12.noarch.rpm"
RPM_HASH = "bf2ddc821ab866d95c2154a29fc12a6b47b0db23410f470b27fa83db95d33b266c653521797936214e16b546bcd6f5b733612f7f635e804b4ed0d8b4d1d561f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yg.lockfile \
python39-yg.lockfile \
python3dist-yg.lockfile"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.functools \
python39-tempora \
python39-zc.lockfile"

inherit rpm
