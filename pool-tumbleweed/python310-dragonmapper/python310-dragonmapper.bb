SUMMARY = "Identification and conversion functions for Chinese text processing"
DESCRIPTION = "Identification and conversion functions for Chinese text processing."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "python310-dragonmapper-0.2.6-3.1.noarch.rpm"
RPM_HASH = "457d291d102d5d459f935234ffbebf394debca67a07df08b0f4dad1893eaeea1ac53825d1165c33f61a75ac7b4e3330b0ec6a0d79596b55547e4788c13893906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dragonmapper \
python3.10dist(dragonmapper) \
python310-dragonmapper \
python3dist(dragonmapper)"

RDEPENDS:${PN} += "python(abi) \
python310-hanzidentifier \
python310-zhon"

inherit rpm
