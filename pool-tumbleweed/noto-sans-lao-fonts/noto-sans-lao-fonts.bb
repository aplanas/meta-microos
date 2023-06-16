SUMMARY = "Noto Lao Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lao Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lao-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "fe02553daf555e5bd74fb88a9586c0ad3d96e4fa9ea730bc395b2d72020bed21667d0f5f6b4a740eee2e9ed0144c0b54368cad903dc2845b0732d053d042bc95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lao \
noto-sans-lao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
