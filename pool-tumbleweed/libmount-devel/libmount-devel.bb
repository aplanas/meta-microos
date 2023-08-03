SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libmount-devel-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "1dfbb38d793bb803075bd283c95130355d64d6ac2300363aca167f6a3e01d1d901a89a7480a0a90aa6de96a221c1178ee0c758d87770f9ed60bbb68b6dac32d9"

RPROVIDES:${PN} += "libmount-devel \
pkgconfig-mount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmount1 \
pkgconfig-blkid \
pkgconfig-libselinux"

inherit rpm
