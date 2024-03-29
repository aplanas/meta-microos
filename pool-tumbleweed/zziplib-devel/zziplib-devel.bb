SUMMARY = "Development files for zziplib, a ZIP compression library"
DESCRIPTION = "That are the header files needed for developing applications using \
ZZipLib."
LICENSE = "LGPL-2.1-or-later"

PV = "0.13.72"

RPM_NAME = "zziplib-devel-0.13.72-1.9.aarch64.rpm"
RPM_HASH = "ddd52e9233cbf22063ff0eafc1a2e4d425cfd98ac563f43f31978323001a7a0c5615cf26c951db7553524340076b5dce95998d6789d796fa6deb0e8e72960ea7"

RPROVIDES:${PN} += "pkgconfig-zzipfseeko \
pkgconfig-zziplib \
pkgconfig-zzipmmapped \
pkgconfig-zzipwrap \
zziplib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzzip-0-13 \
libzzip.so.13 \
libzzipfseeko.so.13 \
libzzipmmapped.so.13 \
pkgconfig-zlib \
pkgconfig-zziplib"

inherit rpm
