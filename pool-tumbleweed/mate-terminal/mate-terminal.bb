SUMMARY = "MATE Desktop terminal emulator"
DESCRIPTION = "MATE Terminal is a terminal emulation application that you can use \
to perform the following actions: \
 * Access a UNIX shell in the MATE environment. \
 * Run any application that is designed to run on VT102, VT220, and \
   xterm terminals."
LICENSE = "GPL-3.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-terminal-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "09a89f57da58cc87b60f5302cb356bf5c8c45cda6a13a0fab7099bc2dcd0d9ef6fce695385dd2eef269fa842a4892ba507e959d99016a6fb12536eadbdecb0af"

RPROVIDES:${PN} += "mate-terminal"

RDEPENDS:${PN} += "/usr/bin/perl \
gsettings-backend-dconf \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdconf.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm
