SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "Unlicense"

PV = "3.12.3"

RPM_NAME = "python39-filelock-3.12.3-1.1.noarch.rpm"
RPM_HASH = "0d8017d55661b4a19d855b4b72f4962aff8d621a46dd66f7781e3b6f0797a0d6a224ab642f6b2ec20e2bb692ad91706d24a30ecabf9338228f7e251dc23bb57c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-filelock \
python39-filelock \
python3dist-filelock"

RDEPENDS:${PN} += "python-abi \
python39-typing-extensions"

inherit rpm
