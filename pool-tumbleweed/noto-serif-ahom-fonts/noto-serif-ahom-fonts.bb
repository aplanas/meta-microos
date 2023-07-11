SUMMARY = "Noto Ahom Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ahom Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-ahom-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "db1a8b72bb1126c42175b3b8485fb9ea890f58e117d3ba5a9f14d6e76efa86cbcbb459a4259da939f0cb69963462cfc85bee682996d6de64ac3ff249ede4797e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-ahom \
noto-serif-ahom-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
