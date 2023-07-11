SUMMARY = "Noto Sinhala Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sinhala Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sinhala-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "291ec4afcef803d7681f2a1461387e2372cde91fb49de71a92a126ad9c56efb0a5b754ed99b04280561e70586113cadaf50b388bfc0d77f331263a2183bff7c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sinhala \
noto-sans-sinhala-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
