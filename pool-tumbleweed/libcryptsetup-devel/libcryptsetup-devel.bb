SUMMARY = "Header files for libcryptsetup"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "libcryptsetup-devel-2.6.1-3.1.aarch64.rpm"
RPM_HASH = "be848d727cc30f925cbd5ca3d2346a5c0e89e3d2eed0c7862c0fe70d880a202731d1a10845fbf7bb641ec7d7abf4f989842179b89627f141453c7991520a5d6b"

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
