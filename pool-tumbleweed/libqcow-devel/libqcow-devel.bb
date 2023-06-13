SUMMARY = "Development files for libqcow"
DESCRIPTION = "libqcow is a library to access the QEMU Copy-On-Write (QCOW) image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libqcow."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "libqcow-devel-20221124-3.9.aarch64.rpm"
RPM_HASH = "84e7092b4a66179c23050cdbab031cdb1076ae49e4ed8e1e47947c0e6cd5b48d7426e1057bf37ddc8b3d61f49070225f4d2aa9eb7f2e7fbd484c4d94ef2fb1e3"

RPROVIDES:${PN} += "libqcow-devel \
libqcow-devel(aarch-64) \
pkgconfig(libqcow)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libqcow1"

inherit rpm
