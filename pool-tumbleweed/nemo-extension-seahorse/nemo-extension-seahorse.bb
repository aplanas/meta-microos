SUMMARY = "OpenPGP encryption/decryption extension for Nemo file manager"
DESCRIPTION = "seahorse nemo is an extension for nemo which allows encryption \
and decryption of OpenPGP files using GnuPG."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-seahorse-5.2.0-3.6.aarch64.rpm"
RPM_HASH = "8b6be71595c16f2752ba0b671982c21fb9622ff9a37161af5be95bc57ba5713cc6f042faaae7b1e645b2187937392a52173320074877e60768724675ae000478"

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
