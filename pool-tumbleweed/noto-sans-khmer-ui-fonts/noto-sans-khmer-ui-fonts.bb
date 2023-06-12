SUMMARY = "Noto Khmer Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khmer Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-khmer-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ef32317360b8c3e4d123a9b9981c5f1b49a4bbd9ba41072ae5e965e7dac342ca1df48990d6c17ac1be5dc1b1ddfc33a3f60384147959cf1e778e3aeddc1d3902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-khmer-ui \
noto-sans-khmer-ui-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
