SUMMARY = "Noto Samaritan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Samaritan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-samaritan-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "a298ce6d41b4d037571e584e3b071cec4cfd3159bb17822c81826e7524ba173a22872a261e0821a83745fbda413a3ec591bacf1c719b71a290b73d43dfa552ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-samaritan \
noto-sans-samaritan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
