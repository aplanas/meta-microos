SUMMARY = "Xfdashboard library"
DESCRIPTION = "A library providing authenticators for Xfdashboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libxfdashboard0-1.0.0-1.4.aarch64.rpm"
RPM_HASH = "5f77d95d9ecf55e0199eb6364724a25cbe0e30f429d13a4df2227dd22a91606e20db386ea41bdbbd4efb9966dd60d64ef15ed532fa70a8142095717c7e01fc9d"

RPROVIDES:${PN} += "libxfdashboard.so.0()(64bit) \
libxfdashboard0 \
libxfdashboard0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXinerama.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libclutter-1.0.so.0()(64bit) \
libcogl.so.20()(64bit) \
libgarcon-1.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libwnck-3.so.0()(64bit) \
libxfce4util.so.7()(64bit)"

inherit rpm
