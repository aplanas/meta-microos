SUMMARY = "Noto Grantha Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Grantha Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-grantha-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "d3fec44dd78646035fa04350bc77e7347fd8e58e589b02bacd64a05809f0b35287388f02cbcf39b96d8d8129c4296de6d05548f8e1ea3db18229d8bfcd01e52b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-grantha \
noto-sans-grantha-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
