SUMMARY = "Library for setting up dm-crypt Based Encrypted Block Devices"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "libcryptsetup12-2.6.1-1.3.aarch64.rpm"
RPM_HASH = "214bfc6c000c81bee002cc70c63633db5751c9917884e81faf5c45c24b465791bf16d867cee41589f8e6036d9b95550256a6297a298de9758387eb132fc6985c"

RPROVIDES:${PN} += "libcryptsetup.so.12()(64bit) \
libcryptsetup12 \
libcryptsetup12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libargon2.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libdevmapper.so.1.03(DM_1_02_97)(64bit) \
libjson-c.so.5()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
