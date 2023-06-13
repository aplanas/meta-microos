SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-click-help-colors-0.9.1-2.1.noarch.rpm"
RPM_HASH = "0a61f6a0e269a24a5e1ce3de3b95ad4d2deb2f91d8bf7baadd298e742af789b057dfdd1db492e171b1064555600ce5d7a261f4cc5bc20eab60d509c8e28ac5cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-help-colors) \
python311-click-help-colors \
python3dist(click-help-colors)"

RDEPENDS:${PN} += "python(abi) \
python311-click"

inherit rpm
