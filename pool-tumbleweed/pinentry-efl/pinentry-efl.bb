SUMMARY = "Simple PIN or Passphrase Entry Dialog for EFL"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using Enlightenment Foundation Libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-efl-1.2.1-3.1.aarch64.rpm"
RPM_HASH = "a933904b9a3ce2b35abec3e1adb832c50b79947dca9603cdfb79fb397187f12b6ae50453e4226e122467b33d63062b9feff938a1e6417928aa12ff20d09935d8"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-efl \
pinentry-dialog \
pinentry-efl \
pinentry-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libecore-x.so.1 \
libecore.so.1 \
libelementary.so.1 \
libevas.so.1 \
libglib-2.0.so.0 \
libgpg-error.so.0 \
libncursesw.so.6 \
libsecret-1.so.0 \
libtinfo.so.6 \
pinentry"

inherit rpm
