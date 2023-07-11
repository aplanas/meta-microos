SUMMARY = "Theme preview application for GTK 2"
DESCRIPTION = "A widget factory is a theme preview application for GTK. It displays the \
various widget types provided by GTK in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the GTK 2 version."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "awf-gtk2-2.7.0-2.1.aarch64.rpm"
RPM_HASH = "ffc541b356d742ba091735f633268c3c92f10ffb69f7091eea3fc2458a077dff57bc16f655d09504ed336cb48371d4c1a0a9c9687032993e885cee441d7ff723"

RPROVIDES:${PN} += "awf-gtk2"

RDEPENDS:${PN} += "gtk2 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
