SUMMARY = "Noto Tibetan Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tibetan Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-tibetan-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "79fdb26d922195d7864a90bece2f2c45999dd8880e17643fc24077eccf4306747e66cb9390155b6fac065f4211e80bab187314bcff63465f1702a7a3f01ac46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tibetan \
noto-sans-tibetan-fonts \
noto-serif-tibetan \
noto-serif-tibetan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
