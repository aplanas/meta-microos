SUMMARY = "Generic async RPC implementation, including JSON-RPC"
DESCRIPTION = "Generic async RPC implementation, including JSON-RPC"
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python310-aiorpcX-0.22.1-1.7.noarch.rpm"
RPM_HASH = "b8a3ef095ab695f02d636ea008da1086e37602286abf9c174e18ee3f688b706ce51ed0d2d784bcc78edd5aa2ca77753aa1718f8148f85f4d336091f00a5d5049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiorpcx \
python310-aiorpcX \
python3dist-aiorpcx"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
