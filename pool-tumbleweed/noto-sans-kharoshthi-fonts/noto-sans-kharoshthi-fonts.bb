SUMMARY = "Noto Kharoshthi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kharoshthi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kharoshthi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "772530cee3ea670d79e597b514524d8725e7419612bbf133a2f750ff377452beaee1d8c8573400260a7015087244ec96082a5670e0f21b914760514ce0363cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kharoshthi \
noto-sans-kharoshthi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
