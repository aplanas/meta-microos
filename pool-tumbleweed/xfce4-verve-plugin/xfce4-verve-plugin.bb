SUMMARY = "Command Line Plugin for the Xfce Panel"
DESCRIPTION = "The Verve panel plugin is a command line plugin for the Xfce panel which \
supports a command history, auto-completion, keyboard-shortcut focus grabbing and \
opening URLs."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "xfce4-verve-plugin-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "ce859542269f13c768bf70b8c1cdf97957ba639deb8675f2341f591bd4b06689dd37bdbca151f38fe0341574e5c5fba4edecc0115c5edaba2f9d6412408bc0bb"

RPROVIDES:${PN} += "libverve.so \
xfce4-panel-plugin-verve \
xfce4-verve-plugin"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpcre2-8.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
