SUMMARY = "Header files for libcryptsetup"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "libcryptsetup-devel-2.6.1-1.3.aarch64.rpm"
RPM_HASH = "4450b81bf3ce7c3f05ad7084fd4a52372b46a07f05896cd377f7464bfa0b757728a4eca173af1cf5dbc8ffcdba9e36a5cd400d562c6747048020a2207a3f68da"

RPROVIDES:${PN} += "cryptsetup-devel \
libcryptsetup-devel \
libcryptsetup-devel(aarch-64) \
pkgconfig(libcryptsetup)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcryptsetup12 \
pkgconfig(blkid) \
pkgconfig(devmapper) \
pkgconfig(json-c) \
pkgconfig(libargon2) \
pkgconfig(openssl) \
pkgconfig(uuid)"

inherit rpm
