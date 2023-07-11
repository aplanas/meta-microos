SUMMARY = "Noto Osage Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Osage Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-osage-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "1372014450cbf9e623bedffb7eb85dd301964adf54d147bfe0584eca7eaba90c690619d53154d9e872d2e4700812bc2db11eb709e2a23e167c0a6f410aa0acbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-osage \
noto-sans-osage-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
