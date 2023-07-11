SUMMARY = "Noto Sora Sompeng Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SoraSompeng Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sorasompeng-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "60f9c74822758d5d9ab78ae0d1086c66f9845094feaed0f34b5512256963d7666184a9b82bc488ece24ace8fca5383d6c5db8394bd64b781180ba14570eef3e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sorasompeng \
noto-sans-sorasompeng-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
