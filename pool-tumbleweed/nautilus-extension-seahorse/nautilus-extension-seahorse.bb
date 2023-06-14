SUMMARY = "Extension for nautilus which allows encryption and decryption of files"
DESCRIPTION = "Seahorse nautilus is an extension for nautilus which allows encryption \
and decryption of OpenPGP files using GnuPG."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.92+95"

RPM_NAME = "nautilus-extension-seahorse-3.11.92+95-1.3.aarch64.rpm"
RPM_HASH = "cc54b4db63c88f27b98e2fd6781e6b961bd348638b956a34ae381de3b6c097a80f193349231b185117a28934c1214490b14f704179fac03a1da3ca24da0b57b3"

RPROVIDES:${PN} += "libnautilus-seahorse.so \
nautilus-extension-seahorse \
seahorse-nautilus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptui.so.0 \
libdbus-glib-1.so.2 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgtk-3.so.0 \
libnautilus-extension.so.4"

inherit rpm
