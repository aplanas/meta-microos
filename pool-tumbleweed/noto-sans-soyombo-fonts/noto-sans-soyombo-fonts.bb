SUMMARY = "Noto Soyombo Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Soyombo Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-soyombo-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "7658430291ac08dd1be42de94c60315164b097325c6a234a98380e35ce657e0e6d59b5a3cceda4af59c501227bba4c1f4d7962bab985bcbc9564e00286c3af9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-soyombo \
noto-sans-soyombo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
