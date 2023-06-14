SUMMARY = "Noto Khojki Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khojki Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-khojki-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6c0931afe58122718396fe959f872d3701e4bd86976acdfab739aa93c74a4a875e2c1563b0407c4caf98627249def315c700832dd0253bb005ca7d8634cd19bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-khojki \
noto-serif-khojki-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
