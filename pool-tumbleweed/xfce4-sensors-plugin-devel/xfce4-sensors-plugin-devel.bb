SUMMARY = "Development Files for xfce4-sensors-plugin"
DESCRIPTION = "This package contains the development files needed to develop applications \
based on libxfce4sensors."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "xfce4-sensors-plugin-devel-1.4.4-1.4.aarch64.rpm"
RPM_HASH = "c3d00cb8da95de3defdc861bc47f8faf27ce6b7394cc02230975a98a6a9f3a50a115bcf7cefa5e27a2cce6cab5d07f15bfd9f5e0e6b36763dcd765c757dbd923"

RPROVIDES:${PN} += "pkgconfig-libxfce4sensors-1.0 \
xfce4-panel-plugin-sensors-devel \
xfce4-sensors-plugin-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-libxfce4ui-2 \
pkgconfig-libxfce4util-1.0 \
xfce4-panel \
xfce4-sensors-plugin"

inherit rpm
