SUMMARY = "Development files for libfsext, Extended File System (ext) library"
DESCRIPTION = "libfsext is a library to access the extended file system (ext) format.  see libfsext for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsext."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext-devel-20230603-2.1.aarch64.rpm"
RPM_HASH = "896bd4dbd073e0a03b5612f1db97b33aa5c6e0c1bcf1d02045a2c35ed8c45ac4f6d7fb24177b9f48e63897ef1db76f9c5ffa0568ed4c58f5cd7bfbbfeebaa675"

RPROVIDES:${PN} += "libfsext-devel \
pkgconfig-libfsext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsext1"

inherit rpm
