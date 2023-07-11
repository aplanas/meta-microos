SUMMARY = "Noto Yezidi Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Yezidi Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-yezidi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "84f6936b456eb0fa3ee9e8754ac3140d36984992bc0dc50fa9c4ff4c8b9cb491e8bc48977953d704da550cd054abe051079e7312b867eea9907eee94dc35272a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-yezidi \
noto-serif-yezidi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
