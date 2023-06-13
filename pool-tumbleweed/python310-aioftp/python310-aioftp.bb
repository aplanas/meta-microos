SUMMARY = "FTP client/server for asyncio"
DESCRIPTION = "aioftp is a python FTP client/server based on asyncio."
LICENSE = "Apache-2.0"

PV = "0.21.4"

RPM_NAME = "python310-aioftp-0.21.4-2.3.noarch.rpm"
RPM_HASH = "27018f1f8be13a2d4ff7120cbdff37ab0fc6f91769fae1138f736b5418b10087d7c4016bad23a94cadd7a9a657e338095fc81edc393601f031139a4207243771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioftp \
python3.10dist(aioftp) \
python310-aioftp \
python3dist(aioftp)"

RDEPENDS:${PN} += "python(abi) \
python310-siosocks"

inherit rpm
