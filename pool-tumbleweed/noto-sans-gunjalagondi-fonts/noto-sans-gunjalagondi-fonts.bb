SUMMARY = "Noto Gunjala Gondi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
GunjalaGondi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gunjalagondi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "6e33533f354efcf2cc58ec14722922ea800b5d30955dbb2381ed80315f4378002a3ecc227296c27270ded6b908c34f2e1c2c9ae97bd868e17891f26b88f7fe2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gunjalagondi \
noto-sans-gunjalagondi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
