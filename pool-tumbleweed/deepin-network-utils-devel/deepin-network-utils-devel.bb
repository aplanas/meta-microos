SUMMARY = "Development tools for Deepin Network Utils"
DESCRIPTION = "The deepin-network-utils-devel package contains the header files for \
deepin-network-utils."
LICENSE = "GPL-3.0+"

PV = "5.4.13"

RPM_NAME = "deepin-network-utils-devel-5.4.13-1.7.aarch64.rpm"
RPM_HASH = "0c9e8c7b5be829b6f9089acd48a95c52ff4e24607d1d6437f15c08b2df8e641a89088a1391bb3e78490ef3ccebceb2c4c56b79dacc83d737ec762706880e64f3"

RPROVIDES:${PN} += "deepin-network-utils-devel \
pkgconfig-dde-network-utils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdde-network-utils1"

inherit rpm
