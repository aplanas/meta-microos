SUMMARY = "OpenPGP encryption/decryption extension for Nemo file manager"
DESCRIPTION = "seahorse nemo is an extension for nemo which allows encryption \
and decryption of OpenPGP files using GnuPG."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-seahorse-5.2.0-4.1.aarch64.rpm"
RPM_HASH = "2e37a4b53c28f7282baa032ac3ee8cc8b17c88699e2e90a43e97733efc013d4fabae59bb357d593f224a5d72d004dfc702b54aae9a9851be1c0e8e0926e79a16"

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
