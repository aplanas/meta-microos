SUMMARY = "Clipboard Manager Plugin for the Xfce Panel"
DESCRIPTION = "This is a clipboard manager which comes with a plugin for the Xfce Panel. It \
stores the X selection (primary and clipboard) contents even after an \
application has quit and is able to handle text and image data. Furthermore, it \
can be configured to execute arbitrary actions when the selection content \
matches specific regular expressions."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.4"

RPM_NAME = "xfce4-clipman-plugin-1.6.4-1.1.aarch64.rpm"
RPM_HASH = "05c45a5808f8684590393e1800e00a09ceca9d09a9d292cd9c9eafd84b2efa0584f809eabf7a49ae0709366dff8f4c9e6ff80c4bf6b2470febb3c5017ef66efe"

RPROVIDES:${PN} += "config-xfce4-clipman-plugin \
libclipman.so \
xfce4-clipman-plugin \
xfce4-panel-plugin-clipman"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libqrencode.so.4 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
