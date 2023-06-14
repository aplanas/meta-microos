SUMMARY = "Date And Time Plugin for the Xfce Panel"
DESCRIPTION = "The date and time plugin displays the current date and time on the panel and \
can open a calendar when clicked."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "xfce4-datetime-plugin-0.8.3-1.3.aarch64.rpm"
RPM_HASH = "d88959529f6e213ab503e54ca742d0e981c3506a668113ea3c69c700bd2f485b8907fde4ea9c207d6339a21229c0ccd74b4c9cbbbc93fb44b049f870b59349f6"

RPROVIDES:${PN} += "libdatetime.so \
xfce4-datetime-plugin \
xfce4-panel-plugin-datetime"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
