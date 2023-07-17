SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libmount-devel-2.39-2.1.aarch64.rpm"
RPM_HASH = "51fd349fd0e0085e898a9f34f27430c1f9eb4f9d69982dd10a09f4bca61dc29abaae8597c66f3d35acf8b5f1c4318e939f5f2394582bb4d277a8c52296e14507"

RPROVIDES:${PN} += "libmount-devel \
pkgconfig-mount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmount1 \
pkgconfig-blkid \
pkgconfig-libselinux"

inherit rpm
