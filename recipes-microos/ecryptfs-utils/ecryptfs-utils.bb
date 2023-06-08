SUMMARY = "Userspace Utilities for ecryptfs"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "ecryptfs-utils-111-7.4.aarch64.rpm"
RPM_HASH = "818cb73be9f4b1d63054ad7b943c56a9eeb5f85896c3598a320c56bd9027decfa18f5466927cba87e481d8c5511a2aa9ea03ec9a7005eac8b797326e6f286710"

RPROVIDES:${PN} += "application() application(ecryptfs-setup-private.desktop) ecryptfs-utils ecryptfs-utils(aarch-64) libecryptfs_key_mod_openssl.so()(64bit) libecryptfs_key_mod_passphrase.so()(64bit) libecryptfs_key_mod_pkcs11_helper.so()(64bit) libecryptfs_key_mod_tspi.so()(64bit)"
RDEPENDS:${PN} += "(kmod(ecryptfs.ko) if kernel) /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libecryptfs.so.1()(64bit) libkeyutils.so.1()(64bit) libkeyutils.so.1(KEYUTILS_0.3)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) libpkcs11-helper.so.1()(64bit) libtspi.so.1()(64bit) pam-config permissions"

inherit rpm
