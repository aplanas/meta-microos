SUMMARY = "Noto Masaram Gondi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MasaramGondi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-masaramgondi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "f39a6602880e9481d0dde293c35a3c64f4d77ea3fdafef89994fa249fd5abdac8c4a1c327ce9fb563d42493432239930a45bdd4d1b1344ac657b985e34612dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-masaramgondi \
noto-sans-masaramgondi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
