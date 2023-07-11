SUMMARY = "Noto Mongolian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mongolian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mongolian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "8e6b2c18a2336bc300dc7ef47fe6464c99397f8c8b749d7136aa18e170cb07287565dc9d46b1268c015efcace9369c6b7e370813728e2902c94f50ec7220065c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mongolian \
noto-sans-mongolian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
