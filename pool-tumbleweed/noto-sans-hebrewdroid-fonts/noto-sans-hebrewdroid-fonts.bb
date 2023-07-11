SUMMARY = "Noto Hebrew Droid Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
HebrewDroid Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hebrewdroid-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b8cefed52d6c16d58fbb2c536bb60b3658b47edf628ac551be7841b351c63cc9a7b244fd469cfc44e57de5211052fbab88ebac10233958621ea05a3ccf6de842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hebrewdroid \
noto-sans-hebrewdroid-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
