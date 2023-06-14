SUMMARY = "Development files for libverto-libev1"
DESCRIPTION = "The libverto-libev-devel package contains libraries and header \
files for developing applications that use libverto-libev."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-libev-devel-0.3.2-3.1.aarch64.rpm"
RPM_HASH = "8bf011b62ad3571b40c06d08cb1827f7eba338848a9e6e1c941acdf89434a9e91055befb76b1cf505e64bcce2f30534c10777cd748d4fdcc9aa176063f5e1279"

RPROVIDES:${PN} += "libverto-libev-devel \
pkgconfig-libverto-libev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libverto-devel \
libverto-libev1 \
pkgconfig-libverto"

inherit rpm
