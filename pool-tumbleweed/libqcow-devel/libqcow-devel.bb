SUMMARY = "Development files for libqcow"
DESCRIPTION = "libqcow is a library to access the QEMU Copy-On-Write (QCOW) image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libqcow."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "libqcow-devel-20221124-4.1.aarch64.rpm"
RPM_HASH = "372f719687b42d8c70275844ebcfae0f436929bcfba52eb17c6ed971a8675c53f01776c1bb692c47cd3910eddcb4a134d356bf0f625ba06d99c8fd67228955b5"

RPROVIDES:${PN} += "libqcow-devel \
pkgconfig-libqcow"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libqcow1"

inherit rpm
