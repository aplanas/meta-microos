SUMMARY = "Development package for the GnuTLS C API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls-devel-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "4a9c4b1ff2b1217be0e9f438eeddfb76a877c60822680dc3cf8562c9d8e091f955ce9c00ed138ebcd9c643e138790b76b9282d90da6d1e2c63c90649416dbb70"

RPROVIDES:${PN} += "gnutls-devel \
libgnutls-devel \
pkgconfig-gnutls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
crypto-policies \
glibc-devel \
gnutls \
libgnutls30 \
pkgconfig-hogweed \
pkgconfig-libidn2 \
pkgconfig-libtasn1 \
pkgconfig-nettle \
pkgconfig-p11-kit-1 \
pkgconfig-zlib"

inherit rpm
