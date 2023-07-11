SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-wheezy.template-3.1.0-1.2.noarch.rpm"
RPM_HASH = "9999a7183d85a2b994ca7c4db644e0d5611cf18de100c39e1be57ea6238ca923b99fb84048e275239c295ddf3a3aace105f2a6c15023534aecc96396389a3bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wheezy.template \
python3.11dist-wheezy.template \
python311-wheezy.template \
python3dist-wheezy.template"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
