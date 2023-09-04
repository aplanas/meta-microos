SUMMARY = "Development package for the GnuTLS C API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "libgnutls-devel-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "29ccfc9d120f01a628a2afbce5a7c02b2a20eb11aed0494b13f9adfafde309a887bdfd8c1f76b984e7dc15da729a7fff0d23554d85d8945cb3f79d602086af77"

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
