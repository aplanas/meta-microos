SUMMARY = "Noto Tagalog Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tagalog Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tagalog-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9a03dbee536e7c636483bf2d4e8ab92570e9fad200de0de3610c163fb5fd9ac492e5b3f1e9b7d81659ff98d20cafab1c40a34d3e29cb2036245f7720d0d50520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tagalog \
noto-sans-tagalog-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
