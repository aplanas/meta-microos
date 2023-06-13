SUMMARY = "Noto Cherokee Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cherokee Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cherokee-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e7ca8ea95a6f1aeedd33693c703c17be08aa2a6663ee4d501ea9f85171c9cac079b3d965fa761f66c2c6bf18c72abe24650a040e305f4b559a449035ec9ac2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cherokee \
noto-sans-cherokee-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
