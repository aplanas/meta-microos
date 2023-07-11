SUMMARY = "Development Files for libnma"
DESCRIPTION = "Development Files for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-devel-1.10.6-1.4.aarch64.rpm"
RPM_HASH = "df9be751189297e3ca71295772c8ccf228d0e93c95782107758538cece8a525242598ce6fe364608b329174ebfcc95ff1db1c7f79f44840f26b1bfbd8317a6af"

RPROVIDES:${PN} += "libnma-devel \
pkgconfig-libnma"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnma0 \
pkgconfig-libnm \
typelib-1-0-NMA-1-0"

inherit rpm
