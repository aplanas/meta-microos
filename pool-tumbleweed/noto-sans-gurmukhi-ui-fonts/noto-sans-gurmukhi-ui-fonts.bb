SUMMARY = "Noto Gurmukhi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gurmukhi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gurmukhi-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "378a06fe96dd5bd94a1a18b9f8d0bd389e203fa9d8943c1e19a0a752022e8863dfdbf8d39e1b71a7a29e9cda82f91d4728f7e2d2137dccb145032848440d80b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gurmukhi-ui \
noto-sans-gurmukhi-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
