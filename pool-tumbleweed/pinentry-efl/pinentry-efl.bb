SUMMARY = "Simple PIN or Passphrase Entry Dialog for EFL"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using Enlightenment Foundation Libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-efl-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "a1aa6d9fbadf17bd248b6071604e5cc0b29e92ab0f0c5b417e645c97ca90c57ba7395183c235e051dc88edc928c3b96cffd6bea0e1b29f76a175d692efeb706a"

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
