SUMMARY = "Simple PIN or Passphrase Entry Dialog for GTK2"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using the GTK2 UI toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-gtk2-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "ad44cced4496b8078c15dc45196e95878ea8c9d2435203c056b140c03925efa83d48232d704d94cb27de19ea76743671d958b926e644725790c86114fc24a3d6"

RPROVIDES:${PN} += "pinentry-dialog \
pinentry-gtk2 \
pinentry-gtk2(aarch-64) \
pinentry-gui \
pinentry:/usr/bin/pinentry-gtk-2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libassuan.so.0()(64bit) \
libc.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpg-error.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libncursesw.so.6()(64bit) \
libsecret-1.so.0()(64bit) \
libtinfo.so.6()(64bit) \
pinentry"

inherit rpm
