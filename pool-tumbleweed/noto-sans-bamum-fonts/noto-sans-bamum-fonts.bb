SUMMARY = "Noto Bamum Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bamum Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bamum-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "035c40d2f169657de93f5d5d3f32ae6bddcd79e126ed8079073e2d32a0c68893b3ee3ae0feec3fbcd088ec600f8ab30db02797149e4396066c015fa223a0b0c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bamum \
noto-sans-bamum-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
