SUMMARY = "Noto Egyptian Hieroglyphs Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
EgyptianHieroglyphs Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-egyptianhieroglyphs-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "c25781621c20904128cf5169f2e1cc2515b0efbe60230b6ce0a2131787850435c49ae78b8b964a865e4ae07afabfa67013ef3ac521a3dd01d88e7653e07108b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-egyptianhieroglyphs \
noto-sans-egyptianhieroglyphs-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
