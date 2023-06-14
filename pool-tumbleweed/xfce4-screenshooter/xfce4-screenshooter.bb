SUMMARY = "Screenshot Tool for the Xfce Desktop"
DESCRIPTION = "Xfce4 Screenshooter is a tool for taking screenshots, it can capture the entire \
screen, the active window or a selected region. Screenshots may be taken with a \
user-specified delay and the resulting images can be saved to a PNG file, \
copied it to the clipboard, opened with another application, or uploaded to \
ZimageZ, a free online image hosting service."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.4"

RPM_NAME = "xfce4-screenshooter-1.10.4-1.1.aarch64.rpm"
RPM_HASH = "c24a991045d62c5743f00319bb9e8d2d2ed84cfbe43b830511d9118e4e9b7331538b11d1c1cdfc485b6ea6852fa65b113675627fefb32e29f24149b5f6ff9e87"

RPROVIDES:${PN} += "xfce4-screenshooter \
xfce4-screenshooter-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libxfce4ui-2.so.0 \
libxfce4ui-tools \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxml2.so.2"

inherit rpm
