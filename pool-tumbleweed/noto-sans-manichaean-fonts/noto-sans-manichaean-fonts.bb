SUMMARY = "Noto Manichaean Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Manichaean Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-manichaean-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "99cf60abc0fc04116bb13fec94ca10cf1acd20c24d659801451ae0e0f31e68720f131393c3a82649566e2b22609112e34912de57835d5a5907667d06e2d5b16e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-manichaean \
noto-sans-manichaean-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
