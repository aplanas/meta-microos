SUMMARY = "Generates terminal blocks & connectors for QElectroTech"
DESCRIPTION = "Allows to generate terminal blocks and connectors for QElectroTech \
electrical diagram software."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "python311-qet_tb_generator-1.3.1-1.6.noarch.rpm"
RPM_HASH = "ec1585851f492aad91db89103ec097a255783594b8c78f0741aeacb651bab9f3105f8eeaaa2841d7c051ade40b1df2b226eaccabd2c4d06329eafd221f2665b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qet-tb-generator \
python3.11dist-qet-tb-generator \
python311-qet-tb-generator \
python3dist-qet-tb-generator"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-qt5 \
qelectrotech \
update-alternatives"

inherit rpm
