SUMMARY = "Miscellaneous utils for asyncio"
DESCRIPTION = "Miscellaneous utils for asyncio."
LICENSE = "MIT"

PV = "17.3.0"

RPM_NAME = "python39-aiomisc-17.3.0-1.1.noarch.rpm"
RPM_HASH = "8086421599223896c23dc0ebede5b581ad04785573828ae8a2a4098940c1c59372ffc61f10c30421484392854c36fdaff59eaf5878429214be0a52595840569f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiomisc \
python39-aiomisc \
python3dist-aiomisc"

RDEPENDS:${PN} += "python-abi \
python39-colorlog \
python39-logging-journald"

inherit rpm
