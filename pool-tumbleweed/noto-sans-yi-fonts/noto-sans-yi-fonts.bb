SUMMARY = "Noto Yi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Yi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-yi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e1e79e8bd3d7f19a73eb9d03bcb76c5198fd65d50a5c37e9573b719227abb3c25c4f9c79eb47da8f98f8f6083067c623e840642d50cfca26a989c1c85a1acc3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-yi \
noto-sans-yi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
