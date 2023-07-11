SUMMARY = "Development Headers for Exiv2"
DESCRIPTION = "Exiv2 is a C++ library and a command line utility to access image \
metadata."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "libexiv2-devel-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "aa07e8240ddce79077caae7cb543f6c1af0808884dac730309f980d5c2104abfe973ac847f2a325e62e5cd87c0b5227fc858c81dfed90a6a01d2a7f5643c5689"

RPROVIDES:${PN} += "cmake-exiv2 \
libexiv2-devel \
pkgconfig-exiv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libexiv2-28 \
libexpat-devel \
libstdc++-devel \
pkgconfig-INIReader \
pkgconfig-expat \
pkgconfig-libbrotlidec \
pkgconfig-libcurl \
pkgconfig-zlib"

inherit rpm
