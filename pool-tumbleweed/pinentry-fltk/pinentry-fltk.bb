SUMMARY = "Collection of Simple PIN or Passphrase Entry Dialogs"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using FLTK libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-fltk-1.2.1-3.1.aarch64.rpm"
RPM_HASH = "8f8e139e4634ba02dfefbc3d64e3674dfb40e0dc125212689a81592d718680c7fa29aeeb1ee4bb649876fc6cd8c55e12fe14559219cb9e01d2c2440515ee301d"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-fltk \
pinentry-dialog \
pinentry-fltk \
pinentry-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpg-error.so.0 \
libncursesw.so.6 \
libsecret-1.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
pinentry"

inherit rpm
