SUMMARY = "Development Files for libburn"
DESCRIPTION = "Development files for developing applications using libisoburn."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "libisoburn-devel-1.5.6-1.1.aarch64.rpm"
RPM_HASH = "f8c2c214fd2728f3b583c99bff76e0663f4c74e5482735f2ee78057514f6ee226afab8cfd8f81145818f1842fb7febb9df94655869b5b0c4fd805bca82352272"

RPROVIDES:${PN} += "libburnia-devel \
libisoburn-devel \
pkgconfig-libisoburn-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libburn-devel \
libisoburn1 \
libisofs-devel"

inherit rpm
