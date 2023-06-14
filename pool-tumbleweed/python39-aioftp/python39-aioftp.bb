SUMMARY = "FTP client/server for asyncio"
DESCRIPTION = "aioftp is a python FTP client/server based on asyncio."
LICENSE = "Apache-2.0"

PV = "0.21.4"

RPM_NAME = "python39-aioftp-0.21.4-2.3.noarch.rpm"
RPM_HASH = "6ad3b48fa3db18565bb4217fc3e31c12d156941cf49b072a70c07514c6ec62de0676b7ec9884c8d127212ecc7ecd5acf771c3d509d8a070977226b31a65a774e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aioftp \
python39-aioftp \
python3dist-aioftp"

RDEPENDS:${PN} += "python-abi \
python39-siosocks"

inherit rpm
