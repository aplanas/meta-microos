SUMMARY = "Generates terminal blocks & connectors for QElectroTech"
DESCRIPTION = "Allows to generate terminal blocks and connectors for QElectroTech \
electrical diagram software."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "python311-qet_tb_generator-1.3.1-1.4.noarch.rpm"
RPM_HASH = "06682e8bf6f417c90edbc8eb76bbdc6a6582de93da2a4cc86d2f33f3ad3847a819d3480d7d117212bb937ad74f0e6c8540d063b0679146d2731ccd0ba540b40c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(qet-tb-generator) \
python311-qet_tb_generator \
python3dist(qet-tb-generator)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-qt5 \
qelectrotech \
update-alternatives"

inherit rpm
