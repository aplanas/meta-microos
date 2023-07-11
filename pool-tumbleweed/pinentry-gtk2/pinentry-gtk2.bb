SUMMARY = "Simple PIN or Passphrase Entry Dialog for GTK2"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using the GTK2 UI toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-gtk2-1.2.1-3.1.aarch64.rpm"
RPM_HASH = "52586a7e859aa965455ed7e0a58fc95dd84b9b047085dadffc1b6c671d196f2370f8aa6d923beac309e98c723884bc5b4ecc9ace1b96f7b67d387133a9791370"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-gtk-2 \
pinentry-dialog \
pinentry-gtk2 \
pinentry-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgtk-x11-2.0.so.0 \
libncursesw.so.6 \
libsecret-1.so.0 \
libtinfo.so.6 \
pinentry"

inherit rpm
