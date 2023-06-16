SUMMARY = "Setup program for dm-crypt Based Encrypted Block Devices"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-2.6.1-1.3.aarch64.rpm"
RPM_HASH = "e1248fff1168e3fd15ffaa2e02b5a1dff5bedbbaef110cf272757de02b02364beb1417479440e7e0dd5ed772b819449ef1433a918ab90b9a4d00c99e1fe1f70c"

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
