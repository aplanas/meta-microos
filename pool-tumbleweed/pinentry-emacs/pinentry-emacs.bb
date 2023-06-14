SUMMARY = "Simple PIN or Passphrase Entry Dialog integrated into Emacs"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, integrated into Emacs."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-emacs-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "b7c49bc06c3ae83cb3afd4aaddc931aa7be1b0b263037a2ea42f57fc78f0bbae8a409474b7c81d9c1d6e5b31f0b95a87501615fb61e6b752a02b275663d8ac24"

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
