SUMMARY = "Collection of Simple PIN or Passphrase Entry Dialogs"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using FLTK libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-fltk-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "eaaad952cf5c9df03ae7db480df1e22689f6455e0fd40d6d8752b55b5b1b0cf9728e6e367ed7463784b4b4230c297aca538f4c8cdc4dd546f9f6a171ff8f4fea"

RPROVIDES:${PN} += "pinentry-dialog \
pinentry-fltk \
pinentry-fltk(aarch-64) \
pinentry-gui \
pinentry:/usr/bin/pinentry-fltk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libassuan.so.0()(64bit) \
libc.so.6()(64bit) \
libfltk.so.1.3()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgpg-error.so.0()(64bit) \
libncursesw.so.6()(64bit) \
libsecret-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
pinentry"

inherit rpm
