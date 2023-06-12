SUMMARY = "Noto Tagalog Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tagalog Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tagalog-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "feef8f1fba37419e3f159b9e5946fbe19cbd4cc812dfd5062ec4cec2f6f2b42ef89f959c7c17e04c8afadac8c43784c839500575774a09cbe887cdb324125a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tagalog \
noto-sans-tagalog-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
