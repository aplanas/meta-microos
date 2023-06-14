SUMMARY = "Noto Adlam Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Adlam Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-adlam-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e9591953c56757d0562690b4f7dd1e3e75aa17cbd3abaec475e185f1576e3bfb86b3f41eef1e23dbec782551d37effef27f58aca13f6ec087821b991f05eb311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-adlam \
noto-sans-adlam-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
