SUMMARY = "Noto Phoenician Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Phoenician Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-phoenician-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "cabdae54267e9da6de1451992d81762004284d4c75bce1c1cc7d45683fe59f8c661ccdc1f5ecfa9f2197ce47621003bd0d71093c7ac390c9fe416e75674df3b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-phoenician \
noto-sans-phoenician-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
