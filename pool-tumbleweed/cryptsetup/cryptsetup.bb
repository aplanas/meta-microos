SUMMARY = "Setup program for dm-crypt Based Encrypted Block Devices"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-2.6.1-2.1.aarch64.rpm"
RPM_HASH = "aa4853c7ab6fa2674eee82b70377d5a22c38b347fe65f13fbb272d796e073599e9df5beb05c96fc3ed3d3ea2e29b062b4f1d260fdd3373b7c8e281bcd1d44e0e"

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
