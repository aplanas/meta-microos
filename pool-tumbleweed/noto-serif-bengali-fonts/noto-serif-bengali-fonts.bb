SUMMARY = "Noto Bengali Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bengali Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-bengali-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6e9e4339998903ae05ccb255f018303fdf79c4a1c3d7ba7e1e0ee133e82bd823bc8d28ebb155a22c5fb78544fc35b65fd25b03340f165ac262b08c02f4a76149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-bengali \
noto-serif-bengali-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
