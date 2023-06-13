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

RPROVIDES:${PN} += "application() \
application(xfce4-screenshooter.desktop) \
metainfo() \
metainfo(xfce4-screenshooter.appdata.xml) \
xfce4-screenshooter \
xfce4-screenshooter(aarch-64) \
xfce4-screenshooter-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libexo-2.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4ui-tools \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
