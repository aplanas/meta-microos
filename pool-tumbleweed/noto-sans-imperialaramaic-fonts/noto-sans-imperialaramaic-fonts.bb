SUMMARY = "Noto Imperial Aramaic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
ImperialAramaic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-imperialaramaic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9fd64cd66ebd960b6fd761b86dba5f9240ca9d5dd7aa941d935af25a612c4655a2b4b2ecc441adf220a665587abc5c002895935e2ea66765e592a792318217fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-imperialaramaic \
noto-sans-imperialaramaic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
