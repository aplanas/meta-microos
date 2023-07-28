SUMMARY = "Development Headers for Exiv2"
DESCRIPTION = "Exiv2 is a C++ library and a command line utility to access image \
metadata."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "libexiv2-devel-0.28.0-2.1.aarch64.rpm"
RPM_HASH = "e1b63e816174a0d74df07b91ca51afee2748fc84eea9423a3b42b52263f9c5e21c626652a70cfa557cee6bb0a41ccfce1e0d23965d93a810f37efa0ad6b46e4d"

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
