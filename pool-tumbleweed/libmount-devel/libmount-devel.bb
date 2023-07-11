SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libmount-devel-2.39-1.1.aarch64.rpm"
RPM_HASH = "79942f8a9a799e7b246c9f34209db591ce821ff712a4303789e4a8e9d4ca6b565d21a3b5ef5103059dba6cdb570a4dbbccf8fd408b301cecd8418ac3de1e2cbb"

RPROVIDES:${PN} += "libmount-devel \
pkgconfig-mount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmount1 \
pkgconfig-blkid \
pkgconfig-libselinux"

inherit rpm
