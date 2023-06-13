SUMMARY = "Text to activity-diagram image generator"
DESCRIPTION = "actdiag generates activity-diagram image files from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-actdiag-3.0.0-1.5.noarch.rpm"
RPM_HASH = "21d3e42d193d16e2b7ae31a2812f5ce1bce3e731afcf1da7875a09fcbe84131675b161ff701e3810628bef1cad17f177a496b01b8ccfc3bc028d035541cc06ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(actdiag) \
python311-actdiag \
python3dist(actdiag)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-blockdiag \
python311-setuptools \
update-alternatives"

inherit rpm
