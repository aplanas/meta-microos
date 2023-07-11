SUMMARY = "Noto Naskh Arabic Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NaskhArabic font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-naskharabic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2ce3de9265e73cd491140b72b66e23d25bda32851eeed92cf2e09929e9a8713848c68c791f04607c3c943a383829bc00b275cde0dda8f67e8390063482069b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-naskharabic \
noto-naskharabic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
