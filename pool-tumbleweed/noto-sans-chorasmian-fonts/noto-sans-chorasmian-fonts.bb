SUMMARY = "Noto Chorasmian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Chorasmian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-chorasmian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "cec68905206d8a1165e3ba91802266b3e68f698f6e680b10e622ad0000b8eb32087a7626db3cc63dcdbad7f4ee62a424bf14dfefff95c638985be53a705d2ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-chorasmian \
noto-sans-chorasmian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
