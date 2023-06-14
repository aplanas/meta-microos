SUMMARY = "Userspace Utilities for ecryptfs"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "ecryptfs-utils-111-7.4.aarch64.rpm"
RPM_HASH = "818cb73be9f4b1d63054ad7b943c56a9eeb5f85896c3598a320c56bd9027decfa18f5466927cba87e481d8c5511a2aa9ea03ec9a7005eac8b797326e6f286710"

RPROVIDES:${PN} += "ecryptfs-utils \
libecryptfs-key-mod-openssl.so \
libecryptfs-key-mod-passphrase.so \
libecryptfs-key-mod-pkcs11-helper.so \
libecryptfs-key-mod-tspi.so"

RDEPENDS:${PN} += "-kmod(ecryptfs.ko) if kernel \
/bin/sh \
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
