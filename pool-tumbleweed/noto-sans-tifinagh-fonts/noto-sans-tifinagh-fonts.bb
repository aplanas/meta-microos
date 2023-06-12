SUMMARY = "Noto Tifinagh Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tifinagh Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinagh-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "a4542c65e7e1988d62bbc510463458e4f9e5105a68ec9da458cc97a38429394dcf33c7bef48c34a86af0a7e54d0c50dcdcfdca749ee214e9d8aa6a00003fb0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinagh \
noto-sans-tifinagh-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
