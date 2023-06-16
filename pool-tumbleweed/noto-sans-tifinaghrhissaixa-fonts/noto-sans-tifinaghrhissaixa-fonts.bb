SUMMARY = "Noto Tifinagh Rhissa Ixa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghRhissaIxa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghrhissaixa-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c6617a4b10b7f4f83cd251424b210257d26be59f805fc7335da92c73aeda97f841ae362585bd65f7e1caf7faca92ba0192219b9518d9b0b491b86e1f385f5111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghrhissaixa \
noto-sans-tifinaghrhissaixa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
