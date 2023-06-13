SUMMARY = "Noto Serif Korean Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular and Bold weights of Serif font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-kr-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "bf32149b661b5062e7dde0e4b950ba43b8168795ff6cb26f30a3adc28928e06ffb31cf89a9dc4ce64c974fd79e3ce896280290c5b3dc9c12f7b8cc4529b983b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-fonts \
locale(ko) \
noto-serif-kr-fonts \
scalable-font-ko"

RDEPENDS:${PN} += "google-noto-serif-kr-bold-fonts \
google-noto-serif-kr-regular-fonts"

inherit rpm
