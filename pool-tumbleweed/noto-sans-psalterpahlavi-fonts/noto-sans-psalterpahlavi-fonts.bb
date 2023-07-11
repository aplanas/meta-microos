SUMMARY = "Noto Psalter Pahlavi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PsalterPahlavi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-psalterpahlavi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "3edfd71c65117eb79ddb9a11dde6db36c1177a6e0a64f36477401370976b9bdcae7ef512c9ef55c9ad3efe1f26dce729f6a5347a7017abbc01e4af91f085df56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-psalterpahlavi \
noto-sans-psalterpahlavi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
