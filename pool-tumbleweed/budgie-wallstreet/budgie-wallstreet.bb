SUMMARY = "Wallstreet applet"
DESCRIPTION = "Budgie WallStreet is a mini-app to switch wallpapers on regular intervalls."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-wallstreet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "952b8175a55b9e51360a824cb88723a62c463cb7e9651e7c007f18bcd3507190cf765e635e610e22b4f95cf10ab5d365c70a8a16c9141e6c4aa0bb626a112649"

RPROVIDES:${PN} += "application() \
application(org.ubuntubudgie.wallstreetcontrol.desktop) \
budgie-wallstreet \
budgie-wallstreet(aarch-64) \
metainfo() \
metainfo(org.ubuntubudgie.wallstreetcontrol.metainfo.xml)"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
