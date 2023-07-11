SUMMARY = "Noto Tamil Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tamil Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tamil-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "53a945ddbc6c43a27fc7ab1204d3242489def985b00ff0561c68a1485bd14493c7a791a285d195785132fde524e4230b9d0ed4f4fa00e61245d4f895d0b20357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tamil \
noto-sans-tamil-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
