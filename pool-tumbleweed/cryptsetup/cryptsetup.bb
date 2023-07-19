SUMMARY = "Setup program for dm-crypt Based Encrypted Block Devices"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-2.6.1-3.1.aarch64.rpm"
RPM_HASH = "627e7ba582b7cc10956f0191ba8071769b55815b5c54662f1c3aa52b08005c0e295adfe6629d472d7d72610f10daf56d69f69b040fe94a6a6677280256a82cee"

RPROVIDES:${PN} += "cryptsetup \
integritysetup \
veritysetup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libpopt.so.0 \
libpwquality.so.1 \
libuuid.so.1"

inherit rpm
