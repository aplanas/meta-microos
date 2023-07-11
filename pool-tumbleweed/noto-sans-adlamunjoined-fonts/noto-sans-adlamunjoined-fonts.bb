SUMMARY = "Noto Adlam Unjoined Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
AdlamUnjoined Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-adlamunjoined-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "32f365445df607adaa2af220c67c7df502bfa73282be63bfb2bb05e8202d95514a9f538147f9d4bccdbabb2cdb5c6498d76b1b7c4e3398ab84b585ab3d727d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-adlamunjoined \
noto-sans-adlamunjoined-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
