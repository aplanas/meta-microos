SUMMARY = "Tiro Devanagari Hindi Fonts"
DESCRIPTION = "Tiro Devanagari Hindi has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-devahindi-fonts-1.52-1.2.noarch.rpm"
RPM_HASH = "6ebff5948e0d26d8fe43671616da200df611a49ec3264532fedd99ef401203e5e993cb234592217df7b97d04b9001f1b66cbddd2920c0be57bb315944d7dfc15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-devahindi-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
