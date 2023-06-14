SUMMARY = "Filesystem Mounting Plugin for the Xfce Panel"
DESCRIPTION = "The Mount plugin allows to mount and unmount filesystems from the panel."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.6"

RPM_NAME = "xfce4-mount-plugin-1.1.6-1.1.aarch64.rpm"
RPM_HASH = "0a0f008cc4c036429fb858aa25d55a7e1ad4a574d88a28139dcddc62c287e9cc7f96ebb6d3d17332f29cb04043419bd47b51f6b2f8681c08d44263c73eb61d61"

RPROVIDES:${PN} += "libmount.so \
xfce4-mount-plugin \
xfce4-panel-plugin-mount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
