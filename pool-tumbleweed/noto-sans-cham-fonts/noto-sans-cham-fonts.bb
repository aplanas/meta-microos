SUMMARY = "Noto Cham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cham-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "effac3ae135bc46589c5fcc98b49d586f5de1d2a82a0e275804493da8e981b9ce3f939d34cfb6a5a9ed0cf923fbc9e40056ad5b4c7500d25ea60ad6a63ca5aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cham \
noto-sans-cham-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
