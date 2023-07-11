SUMMARY = "Noto Dives Akuru Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
DivesAkuru Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-divesakuru-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "65f6d57e410b668a121e0f5cfbff6d83f70b34849daa7bbc17fde21e8b643a8cfd9f97d5a4ad0968976501db7733e5e17d72363c618ee26f2bfb135054d7fc58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-divesakuru \
noto-serif-divesakuru-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
