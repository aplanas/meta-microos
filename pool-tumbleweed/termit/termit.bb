SUMMARY = "Vte-based Terminal Emulator"
DESCRIPTION = "termit is a terminal emulator based on the vte library. It includes tabs, \
bookmarks, and the ability to switch encodings."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "termit-3.1-1.12.aarch64.rpm"
RPM_HASH = "d6b053413089b36a0aa3d3b3a902b685355c9548fdc1c48382aa00a1c179b331efe6bb4bacf4741d2767d5dab39c12c1f4f1f5f4902f74e612cf30c6453d7886"

RPROVIDES:${PN} += "application() \
application(termit.desktop) \
config(termit) \
metainfo() \
metainfo(termit.metainfo.xml) \
termit \
termit(aarch-64)"

RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
liblua5.4.so.5()(64bit) \
libpango-1.0.so.0()(64bit) \
libvte-2.91.so.0()(64bit)"

inherit rpm
