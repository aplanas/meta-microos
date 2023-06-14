SUMMARY = "Generates terminal blocks & connectors for QElectroTech"
DESCRIPTION = "Allows to generate terminal blocks and connectors for QElectroTech \
electrical diagram software."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "python39-qet_tb_generator-1.3.1-1.4.noarch.rpm"
RPM_HASH = "a74f13d295102c615d678e0e5bcc7c4463b69b7c81c794244434020fe1acd140a2d1bab5bcf8cff022e4817f94c7b46f566c9296a8fafa6dddba7d92e8b9c57a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qet-tb-generator \
python39-qet-tb-generator \
python3dist-qet-tb-generator"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-qt5 \
qelectrotech \
update-alternatives"

inherit rpm
