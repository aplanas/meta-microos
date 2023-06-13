SUMMARY = "Noto Naskh Arabic Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NaskhArabic font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-naskharabic-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "0ea1dd2dd2d7ca55d283b1f3499e831dc644728f7a76209f0d13ed18f608b8fcf7e79154687c653bb84da867fe5564af6191837e6120096fe5a14fa45740911f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-naskharabic-ui \
noto-naskharabic-ui-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
