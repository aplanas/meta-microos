SUMMARY = "Noto Arabic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Arabic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-arabic-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b78c49e3a0db3853476718de07a4dace1fa0827567b375d253db50e60674fe46f9c3e0fb26ddb61a89dc47036aa0979ad3c6582fce1cf9a528cd5f9d6f25e81b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-arabic-ui \
noto-sans-arabic-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
