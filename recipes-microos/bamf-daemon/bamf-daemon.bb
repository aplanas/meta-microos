SUMMARY = "Window matching daemon"
DESCRIPTION = "bamf matches application windows to desktop files. \
 \
This package contains the daemon used by the library and a gio \
module that facilitates the matching of applications started \
through GDesktopAppInfo"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "bamf-daemon-0.5.6-1.4.aarch64.rpm"
RPM_HASH = "ce814b7e19d48b4b7db08565d13f57e5b7c13524ea869083b3babe5ca68512c8958d52944c7642ccff251e3f55647623421aa341a841f7dd19d47196ae462b8d"

RPROVIDES:${PN} += "bamf-daemon \
bamf-daemon(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libbamf3-2 \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtop-2.0.so.11()(64bit) \
libstartup-notification-1.so.0()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
