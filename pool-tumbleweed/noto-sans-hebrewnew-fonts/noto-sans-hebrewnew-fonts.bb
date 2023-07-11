SUMMARY = "Noto Hebrew New Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
HebrewNew Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hebrewnew-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ac48923486e1154325b162c5433d65828ab42434c5934a27479254e95579c4fb541f541c25cb5be6e7b54c1231679523655676d00b6cf8cb786cf60e3d947676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hebrewnew \
noto-sans-hebrewnew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
