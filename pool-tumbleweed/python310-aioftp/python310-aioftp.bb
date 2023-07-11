SUMMARY = "FTP client/server for asyncio"
DESCRIPTION = "aioftp is a python FTP client/server based on asyncio."
LICENSE = "Apache-2.0"

PV = "0.21.4"

RPM_NAME = "python310-aioftp-0.21.4-2.5.noarch.rpm"
RPM_HASH = "dc7b1b4336128a4c339b0b98cacf28b58e5aa4c2e2653035019d4dc7f9d5bb80306196a4782b8742392ec9e15830fb4f960f97195b790e227a0b0095d350cfa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aioftp \
python310-aioftp \
python3dist-aioftp"

RDEPENDS:${PN} += "python-abi \
python310-siosocks"

inherit rpm
