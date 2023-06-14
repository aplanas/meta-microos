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

RPROVIDES:${PN} += "bamf-daemon"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libbamf3-2 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libstartup-notification-1.so.0 \
libwnck-3.so.0"

inherit rpm
