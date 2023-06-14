SUMMARY = "Noto Symbols Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Symbols Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-symbols-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "714060dbe79e5d6312bb1342c6d136f7fa26ea1757aeab238d093e8c0f4b416d10790270d43067fb7ed7ea22fa47f5c5c986ba0f6973aa843041fb725541d363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-symbols \
noto-sans-symbols-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
