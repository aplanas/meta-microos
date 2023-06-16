SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-wheezy.template-3.1.0-1.1.noarch.rpm"
RPM_HASH = "e2543fd8e9c9b607492534521f91d4cc1faf9a15e136529422bcfde48c1ff5eb812a76c0b03c130cd6d8e48e6ff60f7e156a5942c516e32dc98c4291f5a05ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-wheezy.template \
python311-wheezy.template \
python3dist-wheezy.template"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
