SUMMARY = "Miscellaneous utils for asyncio"
DESCRIPTION = "Miscellaneous utils for asyncio."
LICENSE = "MIT"

PV = "17.3.0"

RPM_NAME = "python39-aiomisc-17.3.0-1.3.noarch.rpm"
RPM_HASH = "18acfce3e6d1cfec3d3eaf5ec0df7a72844ab9baeaa3ccd442a8c394a159c2c18357e3d6fad559ec30356ef7d690b14124c346fdd1dfae27e085931deec3ff91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiomisc \
python39-aiomisc \
python3dist-aiomisc"

RDEPENDS:${PN} += "python-abi \
python39-colorlog \
python39-logging-journald"

inherit rpm
