SUMMARY = "Manual pages for cmake, a cross-platform make system"
DESCRIPTION = "Manual pages for cmake, a cross-platform make system."
LICENSE = "BSD-3-Clause"

PV = "3.27.2"

RPM_NAME = "cmake-man-3.27.2-1.1.aarch64.rpm"
RPM_HASH = "b79593dd2547e1737bb91882d40bbeb6cb6e0bb3eb107116a560fda57c9cf6be3683f74671c983df9b154e42770a5dfb09ccbce84db7637975823b9af03593df"

RPROVIDES:${PN} += "cmake-man"

RDEPENDS:${PN} += ""

inherit rpm
