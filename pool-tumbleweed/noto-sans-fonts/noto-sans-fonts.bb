SUMMARY = "Noto Sans Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sans font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "910009c10ec0d9792cb4b852f254e9f416ca4f0b2b4610cb6ede1b9b2922a432934529c37e1a2c0fe57e5797949d557b7983e3fb49677cd6bc809d4cdded09be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans \
noto-sans-display \
noto-sans-display-fonts \
noto-sans-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
