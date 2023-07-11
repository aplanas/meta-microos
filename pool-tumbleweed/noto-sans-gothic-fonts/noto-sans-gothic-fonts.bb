SUMMARY = "Noto Gothic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gothic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gothic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "f8b719c72ee05ef236296759e0f8c3679d9e833ded2552907e6fd5ae1ea44f7f90fd86a6060b8ae462a89eb9c33277822bb9abc91f754b2eb783e9c298686056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gothic \
noto-sans-gothic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
