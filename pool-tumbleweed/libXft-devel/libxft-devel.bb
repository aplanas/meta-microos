SUMMARY = "Development files for the X FreeType library"
DESCRIPTION = "Xft is a library that connects X applications with the FreeType font \
rasterization library. Xft uses fontconfig to locate fonts so it has \
no configuration files. \
 \
This package contains the development headers for the library found \
in libXft2."
LICENSE = "MIT"

PV = "2.3.8"

RPM_NAME = "libXft-devel-2.3.8-1.1.aarch64.rpm"
RPM_HASH = "4af53ccbfe65a38535f05bdedd0d6f588513125fa9fa948707cd784f8f2580d0fc116307f5abd1e156070e904ebd50f3309f91728eacb90fc067e3921609a9a8"

RPROVIDES:${PN} += "libXft-devel \
libXft-devel(aarch-64) \
pkgconfig(xft)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXft2 \
pkgconfig(fontconfig) \
pkgconfig(freetype2) \
pkgconfig(xproto) \
pkgconfig(xrender)"

inherit rpm
