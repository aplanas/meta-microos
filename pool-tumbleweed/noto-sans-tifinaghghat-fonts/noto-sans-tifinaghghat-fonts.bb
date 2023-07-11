SUMMARY = "Noto Tifinagh Ghat Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghGhat Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghghat-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "a48602c1234e35c59bd2d3c0306654fa3472dd2f01af76de5dc900d4d5906a12cfaccceebce09fea55231269611674ed8583bdb831207075bb4092d6560dda79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghghat \
noto-sans-tifinaghghat-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
