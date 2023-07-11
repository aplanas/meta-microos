SUMMARY = "Development package for the KDiagram libraries"
DESCRIPTION = "Development package for the KDiagram libraries"
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "kdiagram-devel-2.8.0-1.15.aarch64.rpm"
RPM_HASH = "e09e5e512cc7633604a17ccf5683516e8ac0e5217d2a34df831dba795b21aef59ff4cce57f437c5bffe3ee3c84685630e85189edd12258a35eb91889f21fa96c"

RPROVIDES:${PN} += "cmake-KChart \
cmake-KGantt \
kdiagram-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5PrintSupport \
cmake-Qt5Svg \
cmake-Qt5Widgets \
libKChart2 \
libKGantt2"

inherit rpm
