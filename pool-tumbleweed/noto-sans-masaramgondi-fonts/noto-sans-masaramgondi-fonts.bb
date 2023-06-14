SUMMARY = "Noto Masaram Gondi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MasaramGondi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-masaramgondi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "23ab9522669941827e1f39f536ec6859ae685a36428083d2e0243bcaed1d62ebdc533192a625e35af031cf0e50e02375acdb34f6f4372a94bcce3f2dda55cbb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-masaramgondi \
noto-sans-masaramgondi-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
