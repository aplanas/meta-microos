SUMMARY = "Noto Chakma Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Chakma Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-chakma-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "416c547060416e290fc57e796d23ad4bdd08aceeb240d555ace1ce2736e903ad5110b25fcf513e9ec319ed697c1e08e64af5b8bc2372ecb58f770599b043a48e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-chakma \
noto-sans-chakma-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
