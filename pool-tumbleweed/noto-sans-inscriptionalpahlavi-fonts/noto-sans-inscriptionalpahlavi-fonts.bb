SUMMARY = "Noto Inscriptional Pahlavi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
InscriptionalPahlavi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-inscriptionalpahlavi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2062021d80959753bbe516b5266320ea9322db69f2b59c49fb3612eb862e428ca92721ad301db7fa3980baa361d9352268938eb9979e31222918a6fb40e26c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-inscriptionalpahlavi \
noto-sans-inscriptionalpahlavi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
