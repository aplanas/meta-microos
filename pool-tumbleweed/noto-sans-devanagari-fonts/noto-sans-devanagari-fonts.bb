SUMMARY = "Noto Devanagari Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Devanagari Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-devanagari-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "50d709b9fc014b631f5f7e6f1e3e81f24f0871bc66de71418ab7dab19a4ebcc9e35958173e3c9d5bf89cfb761a5616e23ea9516fe223418d4aa33b5ea4046a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-devanagari \
noto-sans-devanagari-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
