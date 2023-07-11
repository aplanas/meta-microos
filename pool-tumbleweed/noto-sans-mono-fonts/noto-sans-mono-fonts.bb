SUMMARY = "Noto Mono Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mono Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mono-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2c6232729125b932c1ae622d8da77e228ac48be5a93ebc3a7aa8f304e23481026ce184daff2ae3f102e8703e67025c66cac77a2435e68e9e9377b7afda0e2773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-mono \
noto-mono-fonts \
noto-sans-mono \
noto-sans-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
