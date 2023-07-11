SUMMARY = "Noto Vai Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Vai Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-vai-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b57a88dfb81fa67e4e68c03fde61fc74b7044cbd1c2b3443bd4b881a443424c9afc8bcbc99a45e45d9da6f541a71c6507a8f0458577d8bae714f8e27496f4c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-vai \
noto-sans-vai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
