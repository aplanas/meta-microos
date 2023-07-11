SUMMARY = "Noto Kannada Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kannada Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-kannada-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "a3d34e83b370d10c86c4551a8a47ebe42629b5b1a7e77e03ba12659b92b24faaa3b98cd8f7bdd383ff2ba35f52a16f512a2fb8a6fe99f79468e3658d88116b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-kannada \
noto-serif-kannada-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
