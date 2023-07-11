SUMMARY = "Library for setting up dm-crypt Based Encrypted Block Devices"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "libcryptsetup12-2.6.1-2.1.aarch64.rpm"
RPM_HASH = "137dfa5a1b9f7c43b7ef41921c44ead1d8f17e6dbc8f282096e9723389588499240000f802cf610d402c2461a588999f14214728b766bc62a0b1a81bc14fd268"

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
