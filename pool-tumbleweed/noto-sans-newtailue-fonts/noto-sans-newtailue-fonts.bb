SUMMARY = "Noto New Tai Lue Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NewTaiLue Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-newtailue-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "dc513b4723dd5fba1d67d9dc9d053a1dbfcf1b292a27496f27756b7b71f190943a8f0c3a91ad3b11841e99cc57dc71c01d4d85002713583d4b70d61bdd602d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-newtailue \
noto-sans-newtailue-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
