SUMMARY = "Unsupervised and semi-supervised morphological segmentation"
DESCRIPTION = "Morfessor is a tool for unsupervised and semi-supervised \
morphological segmentation"
LICENSE = "BSD-2-Clause"

PV = "2.0.6"

RPM_NAME = "python310-Morfessor-2.0.6-2.13.noarch.rpm"
RPM_HASH = "6311779c8e5659dcd3c6900a8e81c0203a73f56dfb0b458aca88656cdc899028912d472b1ec75c4c1231dcd2b9b31393b2c799a7ff45169b36cd99e9f2118b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Morfessor \
python3.10dist-morfessor \
python310-Morfessor \
python3dist-morfessor"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
