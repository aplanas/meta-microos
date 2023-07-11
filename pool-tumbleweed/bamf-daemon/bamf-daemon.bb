SUMMARY = "Window matching daemon"
DESCRIPTION = "bamf matches application windows to desktop files. \
 \
This package contains the daemon used by the library and a gio \
module that facilitates the matching of applications started \
through GDesktopAppInfo"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "bamf-daemon-0.5.6-1.5.aarch64.rpm"
RPM_HASH = "3ac4f5b3c1578979b21ec6d90294b07b509db92241fb96ee742e6474aba7b176725011ddfbae4432df64b73a17417473db5bdf8d2cab7df043944495dac68151"

RPROVIDES:${PN} += "bamf-daemon"

RDEPENDS:${PN} += "/usr/bin/bash \
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
