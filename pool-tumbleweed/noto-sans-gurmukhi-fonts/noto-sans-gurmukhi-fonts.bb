SUMMARY = "Noto Gurmukhi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gurmukhi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gurmukhi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ba513be5addb5a276a027d15778db735b49c4c63dbe1ab085725239875697411891da0cf6ecae2cbc869dc4404763730b18d007762d344da747fbe6975e50317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gurmukhi \
noto-sans-gurmukhi-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
