SUMMARY = "Noto Psalter Pahlavi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PsalterPahlavi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-psalterpahlavi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c8f659097142aa00529a593bbb4e6be94c777ad3bbd7d45454187b5b0892cbd1803e1f6a885a00d86b8a801047609eaddf2774ba07d3c036ab6896141dcb6ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-psalterpahlavi \
noto-sans-psalterpahlavi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
