SUMMARY = "Miscellaneous utils for asyncio"
DESCRIPTION = "Miscellaneous utils for asyncio."
LICENSE = "MIT"

PV = "17.3.0"

RPM_NAME = "python311-aiomisc-17.3.0-1.1.noarch.rpm"
RPM_HASH = "5dd1efd979a747201642f6b6b28a23e105cb6c75cc945b4f412e963c4156db2da5d928482909a451d122986f2c2c153c18df280aa335e8ea96f1810e10b4f9f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiomisc) \
python311-aiomisc \
python3dist(aiomisc)"
RDEPENDS:${PN} += "python(abi) \
python311-colorlog \
python311-logging-journald"

inherit rpm
