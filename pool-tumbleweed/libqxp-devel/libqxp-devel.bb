SUMMARY = "Development files for libqxp"
DESCRIPTION = "The libqxp-devel package contains libraries and header files for \
developing applications that use libqxp."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libqxp-devel-0.0.2-1.20.aarch64.rpm"
RPM_HASH = "5f65a5441d99edf69737b5689877f9cf8cdaca72ddf15389998c00c1a72beb1806e1468e8353760f6a00d9a88c81c6e7908c833b24c1f438dbee998fc761a6a6"

RPROVIDES:${PN} += "libqxp-devel \
libqxp-devel(aarch-64) \
pkgconfig(libqxp-0.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqxp-0_0-0 \
pkgconfig(librevenge-0.0)"

inherit rpm
