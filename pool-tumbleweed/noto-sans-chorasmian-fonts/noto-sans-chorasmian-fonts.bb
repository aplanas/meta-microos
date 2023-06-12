SUMMARY = "Noto Chorasmian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Chorasmian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-chorasmian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "88b5a3bd28c0246f4f5044be9831560bb68d709e780535b98877bab82eea950795dadb78d04464c6e025cf883d2340e980fbd14a64dd77afbf31eed92c1c7c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-chorasmian \
noto-sans-chorasmian-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
