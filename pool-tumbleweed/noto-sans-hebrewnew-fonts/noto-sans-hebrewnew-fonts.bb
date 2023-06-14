SUMMARY = "Noto Hebrew New Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
HebrewNew Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hebrewnew-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "1ccc525b1d650a3a91fde9f79e2ef00818fe486bf9389ed17525ca6daffb8920953ba8d66f371412d7df7bd9a41d3c358c2d771575adeef33bc389f7fec0ddd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hebrewnew \
noto-sans-hebrewnew-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
