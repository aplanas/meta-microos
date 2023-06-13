SUMMARY = "Async generators and context managers for Python 3.5+"
DESCRIPTION = "Python 3.6 added async generators. Python 3.7 adds some more \
tools to make them usable, like contextlib.asynccontextmanager."
LICENSE = "Apache-2.0 | MIT"

PV = "1.10"

RPM_NAME = "python311-async_generator-1.10-3.1.noarch.rpm"
RPM_HASH = "905a0c01847fdbb2b3fe04e7e085b6cf5609e79cecbfcddc8e8bf6026e3dcd69e3b8803d91f43f1df1c0b090fe45ca6c1274e0ef43821df8772c5a631a562553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(async-generator) \
python311-async_generator \
python3dist(async-generator)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
