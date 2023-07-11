SUMMARY = "Header files for libcryptsetup"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "libcryptsetup-devel-2.6.1-2.1.aarch64.rpm"
RPM_HASH = "8c849e04dccf32ad89bbea64e206375dfef449022eb5dafd43b19ba4f8a294c8948ed1796875b42f055594cfdceab97a51e45d644988b6ec6c0208d4a6bdf2d4"

RPROVIDES:${PN} += "cryptsetup-devel \
libcryptsetup-devel \
pkgconfig-libcryptsetup"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcryptsetup12 \
pkgconfig-blkid \
pkgconfig-devmapper \
pkgconfig-json-c \
pkgconfig-libargon2 \
pkgconfig-openssl \
pkgconfig-uuid"

inherit rpm
