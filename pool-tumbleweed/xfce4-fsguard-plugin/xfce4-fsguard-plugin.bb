SUMMARY = "Filesystem Space Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The FSGuard plugin constantly monitors free space of a given mountpoint and \
displays it as an icon in the panel."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "xfce4-fsguard-plugin-1.1.3-1.1.aarch64.rpm"
RPM_HASH = "dea97075f49333b264ea7c6999eb050e496c13d3f9b2c28abde1d44e13f8e9d49350b71358d385b4e694274e675dbf0f22ee34d02594e9c3afb86d6b06fa77c0"

RPROVIDES:${PN} += "libfsguard.so()(64bit) \
xfce4-fsguard-plugin \
xfce4-fsguard-plugin(aarch-64) \
xfce4-panel-plugin-fsguard"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
xfce4-panel"

inherit rpm
