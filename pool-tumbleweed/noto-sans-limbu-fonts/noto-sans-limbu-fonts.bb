SUMMARY = "Noto Limbu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Limbu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-limbu-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "47b94a27a0557c360c3c2eb795c70469d983417cac88e0abd4eddc076a61656eab5ffc759d6c563720d92bf9d7b9c029db8a91130488d16acce5ff78406a2dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-limbu \
noto-sans-limbu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
