SUMMARY = "Noto Tamil Slanted Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TamilSlanted Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-tamilslanted-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "6f006e7656087701455d0c4933eee2500eb2b845164e83145eb96d0aa378b14e47e22895f47e559f2efcb9f82d27e4b29d5542ead0d89d5731e2cd284a0a4381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-tamilslanted \
noto-serif-tamilslanted-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
