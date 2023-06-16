SUMMARY = "Noto Inscriptional Parthian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
InscriptionalParthian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-inscriptionalparthian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "36f19140a099536d784f8abe50c996b0f33c10769fb739fdb21d0f55c3d46fe1306695384e4f6451e4405daacebe8bd48e9b72711d71670e728feb95a5928a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-inscriptionalparthian \
noto-sans-inscriptionalparthian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
