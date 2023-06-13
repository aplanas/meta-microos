SUMMARY = "Development files for Mousepad"
DESCRIPTION = "Development files for Mousepad plugin development"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "mousepad-devel-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "bb6cff21aca4837a1cd8833c6430f15c34f893ef19f74a43464be1a9cc95626696fe8f77d19d192619874a507ba35046ccdaba5e0a5cedefd84de6032d7245a7"

RPROVIDES:${PN} += "mousepad-devel \
mousepad-devel(aarch-64)"

RDEPENDS:${PN} += "libmousepad0"

inherit rpm
