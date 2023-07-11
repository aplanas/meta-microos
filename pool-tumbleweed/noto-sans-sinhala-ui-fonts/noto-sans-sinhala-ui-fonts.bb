SUMMARY = "Noto Sinhala Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sinhala Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sinhala-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "88543ecfc72c60fa80356d30b04de9018ca31489b54512ec983bb057c009a232a28a2f75f3675163a62959560c24f73d2d0034e0c9e5f4619467d5879aad1309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sinhala-ui \
noto-sans-sinhala-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
