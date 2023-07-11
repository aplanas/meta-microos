SUMMARY = "Common data files for the Cheese webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package contains common data that is used by the cheese libraries, \
like schemas."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "libcheese-common-44.0.1-1.2.noarch.rpm"
RPM_HASH = "203e0cc7c5d779eb250482657ea8c90d85c1bee102afcbaf7e0c98cd2098412fc34abf4475867088fec2ce2e7c965f982d8a5ebbfd348ef2a7b62cb08049b1c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcheese-common"

RDEPENDS:${PN} += ""

inherit rpm
