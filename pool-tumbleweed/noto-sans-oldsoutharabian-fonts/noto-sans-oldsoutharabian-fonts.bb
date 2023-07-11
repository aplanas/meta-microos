SUMMARY = "Noto Old South Arabian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldSouthArabian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldsoutharabian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "05c5e69d9697ed700f385a6e102487ff267548f113e9773f1a47ce9a669f9d3c1df74796e520feba24c3875c2c437191b99e6860919f86765b554fe8a9594bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldsoutharabian \
noto-sans-oldsoutharabian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
