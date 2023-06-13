SUMMARY = "GNOME Terminal"
DESCRIPTION = "This package provides the GNOME terminal emulator application."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.1"

RPM_NAME = "gnome-terminal-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "a83d1c4992b60c5c80b0fa82923fb5795faa85e361311044f130f0d52f7c19023e80d7b39ae26734118755759af83d2365ba3c5c0a018f1408e9931ac5421002"

RPROVIDES:${PN} += "application() \
application(org.gnome.Terminal.Preferences.desktop) \
application(org.gnome.Terminal.desktop) \
gnome-terminal \
gnome-terminal(aarch-64) \
metainfo() \
metainfo(org.gnome.Terminal.metainfo.xml)"

RDEPENDS:${PN} += "filesystem \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit) \
libvte-2.91.so.0()(64bit)"

inherit rpm
