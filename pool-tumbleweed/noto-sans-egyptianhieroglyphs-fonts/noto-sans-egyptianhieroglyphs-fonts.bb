SUMMARY = "Noto Egyptian Hieroglyphs Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
EgyptianHieroglyphs Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-egyptianhieroglyphs-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "00e6ddf8eb918980a7b64ee59028bea29441876026589e4ae9160eff569b925525d815a1b146ca4f5c916a7364cfcf3d1faf90f78f08ea643a1f4a9a85783da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-egyptianhieroglyphs \
noto-sans-egyptianhieroglyphs-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
