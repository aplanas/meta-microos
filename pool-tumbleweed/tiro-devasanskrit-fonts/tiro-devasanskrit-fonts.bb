SUMMARY = "Tiro Devanagari Sanskrit Fonts"
DESCRIPTION = "Tiro Devanagari Sanskrit has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-devasanskrit-fonts-1.52-1.2.noarch.rpm"
RPM_HASH = "429bd273992ada025393013ff8be7c4d596be5caf35ec46b74c5a87756118fc28c5232859073a16d0583d7d64dd12f6f4acf441ca935deec56755a088ed31edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-devasanskrit-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
