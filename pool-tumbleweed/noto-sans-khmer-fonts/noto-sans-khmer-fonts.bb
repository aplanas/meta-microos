SUMMARY = "Noto Khmer Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khmer Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-khmer-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "7bd4f6ab80f6d5873f3036382dd55b3668f757cd6ad5e4f50b8744c37e675aa79f7cd8475a96380d4feb018a17fc3afbbf25846b568ff467c30c722256520ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-khmer \
noto-sans-khmer-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
