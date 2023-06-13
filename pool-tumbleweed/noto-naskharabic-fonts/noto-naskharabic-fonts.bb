SUMMARY = "Noto Naskh Arabic Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NaskhArabic font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-naskharabic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "51530827e5faf96ad0f4aacd248d9465fdcb55057d8c257e23dcff748571bc5f3fe8cb84286b327ca9b0a9e9d5fc0daa6867c9c72ead810581d2160056a70c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-naskharabic \
noto-naskharabic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
