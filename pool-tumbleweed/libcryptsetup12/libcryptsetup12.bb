SUMMARY = "Library for setting up dm-crypt Based Encrypted Block Devices"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "libcryptsetup12-2.6.1-3.1.aarch64.rpm"
RPM_HASH = "a077f0920f52af63956c500cb3c2b74ec15403550bde5851cfbf3f89723edd1346c418c7b3528c9a8f83e7c811e2bb1673c39d9edd6e169deba23f8f9f5a618d"

RPROVIDES:${PN} += "libcryptsetup.so.12 \
libcryptsetup12 \
libcryptsetup12-hmac"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libblkid.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdevmapper.so.1.03 \
libjson-c.so.5 \
libuuid.so.1"

inherit rpm
