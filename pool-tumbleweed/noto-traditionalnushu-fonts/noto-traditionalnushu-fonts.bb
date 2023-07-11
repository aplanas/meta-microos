SUMMARY = "Noto Traditional Nushu Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TraditionalNushu font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-traditionalnushu-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "cb5758c6b95fb82b61db986cfc69d448a93d4ec125a7869519492c2ee6e49e345358fec3e07fc58900bfc9e6a1e9ea13bdea84b82c66dcc7a635c8619c1574eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-traditionalnushu \
noto-traditionalnushu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
