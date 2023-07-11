SUMMARY = "Noto Gurmukhi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gurmukhi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gurmukhi-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "38530dc2735962d57a1886a4287e79904c5b991fdca5a1280248898e91c297b11cd53386a9a5c9c9abb09030a253b444bd3e15e9bfee91dc883b587feb430ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gurmukhi-ui \
noto-sans-gurmukhi-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
