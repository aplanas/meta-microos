SUMMARY = "Vector/OTF versions of the Xorg fixed font"
DESCRIPTION = "The 8x13, 9x15 and 10x20 monospace bold fonts from Xorg."
LICENSE = "MIT"

PV = "7.6"

RPM_NAME = "consoleet-xorg-fonts-7.6-1.2.noarch.rpm"
RPM_HASH = "78a0d24a963a2c109db4bdf15b8a84a9d08b62093917c0bb2016a4354538b8a5bde063c3c799bbb3dd31ae14c214e7598d420ee35ea25d2c854376db73753a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-xorg-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
