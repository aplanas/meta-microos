SUMMARY = "GNOME System Log Viewer"
DESCRIPTION = "A utility for viewing detailed event logs for the system."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-logs-43.0-1.3.aarch64.rpm"
RPM_HASH = "a7dd0312245c28360323a4d0cf9381474908dd856f70366d18ee7734a9d8188f61a1f4660b12a5e792692fbb3bc49b43776eb66a737e3b750a9c8cfa8f12aac4"

RPROVIDES:${PN} += "application() \
application(org.gnome.Logs.desktop) \
gnome-logs \
gnome-logs(aarch-64) \
metainfo() \
metainfo(org.gnome.Logs.appdata.xml)"
RDEPENDS:${PN} += "gsettings-desktop-schemas \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
