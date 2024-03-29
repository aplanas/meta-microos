SUMMARY = "Keyboard LEDs plugin for the Xfce panel"
DESCRIPTION = "This plugin allows to display the keyboard LED state in the Xfce panel"
LICENSE = "GPL-2.0-only"

PV = "0.2.5"

RPM_NAME = "xfce4-kbdleds-plugin-0.2.5-1.7.aarch64.rpm"
RPM_HASH = "0326f33fabe6434da96462844b59e7e733a0e99ae67d117b29a781adf5ac955c63456758d60677f8e91639500d577c7ed93b41446bee0f7d1659f0885426e3b3"

RPROVIDES:${PN} += "libkbdleds.so \
xfce4-kbdleds-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
