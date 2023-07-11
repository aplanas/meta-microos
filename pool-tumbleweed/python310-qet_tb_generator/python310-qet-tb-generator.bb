SUMMARY = "Generates terminal blocks & connectors for QElectroTech"
DESCRIPTION = "Allows to generate terminal blocks and connectors for QElectroTech \
electrical diagram software."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "python310-qet_tb_generator-1.3.1-1.6.noarch.rpm"
RPM_HASH = "8c6f898398bdae69a880412901043288461fa452288e778fdc4bcacb6632b47c4dfbea9b0be80855c7b4eadc378ba89ea1017f6fb31eace80461abe39d379d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qet-tb-generator \
python310-qet-tb-generator \
python3dist-qet-tb-generator"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-qt5 \
qelectrotech \
update-alternatives"

inherit rpm
