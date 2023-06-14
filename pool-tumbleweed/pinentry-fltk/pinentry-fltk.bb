SUMMARY = "Collection of Simple PIN or Passphrase Entry Dialogs"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using FLTK libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-fltk-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "eaaad952cf5c9df03ae7db480df1e22689f6455e0fd40d6d8752b55b5b1b0cf9728e6e367ed7463784b4b4230c297aca538f4c8cdc4dd546f9f6a171ff8f4fea"

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
