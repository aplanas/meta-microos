SUMMARY = "Development files for libwapcaplet"
DESCRIPTION = "The libwapcaplet-devel package contains libraries and header files for \
developing applications that use libwapcaplet."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "libwapcaplet-devel-0.4.3-2.8.aarch64.rpm"
RPM_HASH = "2db06643c4549c167ece148511d63299b4d8660324a696b22339ae5ffe5976e1260f8b36e9b4cef56be22d83b197b76e390cea47dc18a2326da5d9a1c81e0b68"

RPROVIDES:${PN} += "libwapcaplet-devel \
pkgconfig-libwapcaplet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwapcaplet0"

inherit rpm
