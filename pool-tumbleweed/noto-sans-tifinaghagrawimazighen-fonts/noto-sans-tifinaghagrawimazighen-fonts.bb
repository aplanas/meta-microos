SUMMARY = "Noto Tifinagh Agraw Imazighen Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAgrawImazighen Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghagrawimazighen-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "14b381b35e83a4902488924eabe3917ebaf1c49b46c4759241325baf2c9064736323fe520db536c22f42d0378275e565e2f27cbcd6d9b19b4dc49fa215b7524b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghagrawimazighen \
noto-sans-tifinaghagrawimazighen-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
