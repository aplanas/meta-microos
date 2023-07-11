SUMMARY = "Userspace Utilities for ecryptfs"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "ecryptfs-utils-111-7.5.aarch64.rpm"
RPM_HASH = "1626488060e4c7245feaaf630a579d142967e740cdaafc8fd131dd3a3d89a8c91fb74c2f13dd175d6700b6ea7a0d22eec5b6218db7ef2ca8f4fbbdd7da9b7b60"

RPROVIDES:${PN} += "ecryptfs-utils \
libecryptfs-key-mod-openssl.so \
libecryptfs-key-mod-passphrase.so \
libecryptfs-key-mod-pkcs11-helper.so \
libecryptfs-key-mod-tspi.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libecryptfs.so.1 \
libkeyutils.so.1 \
libpam.so.0 \
libpkcs11-helper.so.1 \
libtspi.so.1 \
pam-config \
permissions"

inherit rpm
