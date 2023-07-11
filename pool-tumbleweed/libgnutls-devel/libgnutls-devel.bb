SUMMARY = "Development package for the GnuTLS C API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls-devel-3.8.0-4.2.aarch64.rpm"
RPM_HASH = "efab38c084f8736bd9f5d8f9a73582f55012aa0122f93862ed13be742e01facf927298d548d8d7c66a49c34563729b7af3ab143785f0509bed22b6b4f68f925b"

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
