SUMMARY = "Noto Siddham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Siddham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-siddham-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "dd8874bd7fbd4341b276ec1e02abbccef8f7ba91b78a7eca80a43216e8438d4892dcb8d398dc4994e1f612483cdf727e9721e34c0db106c6bccb7d5974860d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-siddham \
noto-sans-siddham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
