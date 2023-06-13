SUMMARY = "Noto Gothic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gothic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gothic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "88e9f7db0321b38002ff1e4a20df2531338b2270fd45134e1825a2ba91cf2be57dbd21d491f718ffd07ba70de64c196733caf277b13db22d9bf5f2ecffa6c735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gothic \
noto-sans-gothic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
