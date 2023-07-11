SUMMARY = "Noto Cuneiform Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cuneiform Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cuneiform-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "bb0ddb722623d393efd7478e46bb44b1b5882b5513dbfdac0667d22ec53085703b77c35244eec0f9278613ec3c2355edaf55dd1f390589f25383279076ba38e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cuneiform \
noto-sans-cuneiform-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
