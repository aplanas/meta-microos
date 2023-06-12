SUMMARY = "Noto Serif Japanese Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular and Bold weights of Serif font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-jp-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "31a55ae772df8b432341fc5e38a8931e2908e838d9b34b9577837cf4570fb81b01ca61388e13c2d08ee4fca384d2984cb38bd9e0bac0118a0a098abf8408a968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-fonts \
locale(ja) \
noto-serif-jp-fonts \
scalable-font-ja"
RDEPENDS:${PN} += "google-noto-serif-jp-bold-fonts \
google-noto-serif-jp-regular-fonts"

inherit rpm
