SUMMARY = "Noto Serif Korean Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bold weight of Serif font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-kr-bold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "38070968394add45a48cab05934c3f84f7cf8dc0e13f51e3c5937160776ee518ff8eab104f9fab5d323b83de12de3cc40fb4f91e09494212dcb83f096dabdbc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-bold-fonts \
noto-serif-kr-bold-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
