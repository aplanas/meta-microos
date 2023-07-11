SUMMARY = "Generates terminal blocks & connectors for QElectroTech"
DESCRIPTION = "Allows to generate terminal blocks and connectors for QElectroTech \
electrical diagram software."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "python39-qet_tb_generator-1.3.1-1.6.noarch.rpm"
RPM_HASH = "d9682e0caa50a7492c2d18f2bdd32ba51c4022a3143303fe93d23e52f9c55ffd4485d6c192b64758d43a0e78ac3937710437293c89779ba8af721832320df8c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qet-tb-generator \
python39-qet-tb-generator \
python3dist-qet-tb-generator"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-qt5 \
qelectrotech \
update-alternatives"

inherit rpm
