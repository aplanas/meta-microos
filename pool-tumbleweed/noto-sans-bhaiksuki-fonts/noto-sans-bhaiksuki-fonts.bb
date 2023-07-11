SUMMARY = "Noto Bhaiksuki Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bhaiksuki Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bhaiksuki-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "883999ee91fc96cb41620eed8e6560b03bbe2acb8505b9b4f7479532cf5828aaf983e940bc0b13ebaf00eb552d3aaf2aa0c7b976a6d06cffea01021bb3033f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bhaiksuki \
noto-sans-bhaiksuki-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
