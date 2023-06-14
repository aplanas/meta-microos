SUMMARY = "Noto Kufi Arabic Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
KufiArabic font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-kufiarabic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "863bc4eafcf5338b6b357ac1df4d3e803316e376066b9b9fa2ba4e5584a587701adda82b87b2e68097576ec7691fb7f280b9600211c130478f8c1156398e87ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-kufiarabic \
noto-kufiarabic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
