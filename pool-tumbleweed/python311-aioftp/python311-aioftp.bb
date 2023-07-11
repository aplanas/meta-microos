SUMMARY = "FTP client/server for asyncio"
DESCRIPTION = "aioftp is a python FTP client/server based on asyncio."
LICENSE = "Apache-2.0"

PV = "0.21.4"

RPM_NAME = "python311-aioftp-0.21.4-2.5.noarch.rpm"
RPM_HASH = "cfb33818f6418975db580a0f3e61abb8835f125ca45c07e40f14b27811f3e104212119e45ba1505930ee687361a9efb32900a8c53bb27e08fff77066c3ee891f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioftp \
python3.11dist-aioftp \
python311-aioftp \
python3dist-aioftp"

RDEPENDS:${PN} += "python-abi \
python311-siosocks"

inherit rpm
