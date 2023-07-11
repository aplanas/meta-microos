SUMMARY = "Noto Naskh Arabic Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NaskhArabic font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-naskharabic-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "e87dec52c4606d933526646592d7efcec1056eca91818790899a717206be7599b7d8816682030261817735aefc913f0c44570de12b7d88f5c01bdb8fe3e0402a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-naskharabic-ui \
noto-naskharabic-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
