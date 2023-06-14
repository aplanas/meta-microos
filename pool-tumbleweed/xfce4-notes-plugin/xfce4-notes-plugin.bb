SUMMARY = "Note-taking Plugin for the Xfce Panel"
DESCRIPTION = "The Notes plugin provides the equivalent to post-it notes on the Xfce desktop \
and allows to quickly take and store small notes."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.0"

RPM_NAME = "xfce4-notes-plugin-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "378aa814fb4f14b547b1ebb3dc97cbd8d28edf059bcaf766dedc48ebcdcaeccd7cb1f2bf2db2a317770771fddb3e42fa6ce0d53d4bca10784e268ff975a461aa"

RPROVIDES:${PN} += "libnotes.so \
xfce4-notes-plugin \
xfce4-panel-plugin-notes"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
