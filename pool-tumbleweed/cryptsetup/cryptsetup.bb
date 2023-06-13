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
cryptsetup(aarch-64) \
integritysetup \
veritysetup"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libblkid.so.1(BLKID_2.17)(64bit) \
libblkid.so.1(BLKID_2.21)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcryptsetup.so.12()(64bit) \
libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) \
libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) \
libcryptsetup.so.12(CRYPTSETUP_2.5)(64bit) \
libcryptsetup.so.12(CRYPTSETUP_2.6)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libpwquality.so.1()(64bit) \
libpwquality.so.1(LIBPWQUALITY_1.0)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
