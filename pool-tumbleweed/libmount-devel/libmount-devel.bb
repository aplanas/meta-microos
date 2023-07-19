SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libmount-devel-2.39-3.1.aarch64.rpm"
RPM_HASH = "3fd0e56be4a7fec5e958957c0a0b6c94955aaa307cc34dc7b9f057e57d45a112a77db20811867f32c5bbe1eddaa634746d46f103f188844544b1370a0baf14e4"

RPROVIDES:${PN} += "libmount-devel \
pkgconfig-mount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmount1 \
pkgconfig-blkid \
pkgconfig-libselinux"

inherit rpm
