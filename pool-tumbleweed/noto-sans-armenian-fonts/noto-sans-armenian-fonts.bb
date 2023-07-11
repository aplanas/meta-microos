SUMMARY = "Noto Armenian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Armenian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-armenian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9bba97072f9705a539ea40437c0482fbd20b396941104270c1b021ed07f6daa519d3317826cbdce13f76763e53ee42c342c8e1b14adbe67fd9c3fe5c1586eb75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-armenian \
noto-sans-armenian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
