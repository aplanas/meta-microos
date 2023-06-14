SUMMARY = "OpenPGP encryption/decryption extension for Nemo file manager"
DESCRIPTION = "seahorse nemo is an extension for nemo which allows encryption \
and decryption of OpenPGP files using GnuPG."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-seahorse-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "ce956fe10e0cc6c73bf6d7411b6a2c0d104e2c5163bf1638151de3c775c65126b51757eaebb444df8d362145af448a2ba61049295ac0d3e893a35edc8ef6c6ef"

RPROVIDES:${PN} += "libnemo-image-converter.so \
libnemo-seahorse.so \
nemo-extension-seahorse \
nemo-seahorse"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptui.so.0 \
libdbus-glib-1.so.2 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
libnotify.so.4 \
nautilus-extension-seahorse \
nemo"

inherit rpm
