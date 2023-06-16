SUMMARY = "Tiro Devanagari Marathi Fonts"
DESCRIPTION = "Tiro Devanagari Marathi has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-devamarathi-fonts-1.52-1.2.noarch.rpm"
RPM_HASH = "22a9e4ff6708d5b7e9dd9a64a3cae500e3f2255394e90f8ace316400b76fbf501d00d8d5e1f015493b3d670fdc26c9e9e2303beb364b821118c9fea6ac70ee52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-devamarathi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
