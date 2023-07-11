SUMMARY = "Simple PIN or Passphrase Entry Dialog integrated into Emacs"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, integrated into Emacs."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-emacs-1.2.1-3.1.aarch64.rpm"
RPM_HASH = "1f715d3c0b833f123735465b6fce813e64f3ba113e8d4efe0841e6c380de149b1159139c039e179271d32478f8b7d9b53761072cbde8ea6872e2880ac0b5deb7"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-emacs \
pinentry-dialog \
pinentry-emacs \
pinentry-gui"

RDEPENDS:${PN} += "emacs \
ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgpg-error.so.0 \
libsecret-1.so.0 \
pinentry"

inherit rpm
