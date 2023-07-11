SUMMARY = "Noto Old Permic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldPermic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldpermic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "0155bd857e51a6acc5e666521c442581858911c3433ab9d920ac65f087a0ad760fd8df0a224549d83108ab5b9bb123bcf2998e4b720dd421bf11c54ac26540f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldpermic \
noto-sans-oldpermic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
