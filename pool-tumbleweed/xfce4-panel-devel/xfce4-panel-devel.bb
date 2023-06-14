SUMMARY = "Development Files for xfce4-panel"
DESCRIPTION = "The xfce4-panel-devel package contains development files needed to to develop \
panel plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "xfce4-panel-devel-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "abc2fccd915e4caf92d9834fc8ea3a290071574f6531607ab9f7733cec82d211c9ada299ae0be75fec0104b929b42ef1e48e18dc4ce4783db1385e1a646e33c4"

RPROVIDES:${PN} += "pkgconfig-libxfce4panel-2.0 \
xfce4-panel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxfce4util-1.0 \
xfce4-panel"

inherit rpm
