SUMMARY = "Noto Buginese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Buginese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-buginese-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "012bff5ab3ff7c7f0492d754f560645e7254e876c135ae431150ec59db65aefdff5d32ef29f5562a5d80aad03b0caba0fc69b686d3a16e3284cbdfcab10a6ecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-buginese \
noto-sans-buginese-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
