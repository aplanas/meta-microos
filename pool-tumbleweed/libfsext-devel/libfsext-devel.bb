SUMMARY = "Development files for libfsext, Extended File System (ext) library"
DESCRIPTION = "libfsext is a library to access the extended file system (ext) format.  see libfsext for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsext."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext-devel-20230603-1.4.aarch64.rpm"
RPM_HASH = "0671dadb1e859d3910bd6cadfe632f9fe494731ec8af162bdfd56c147cdc22949180bc325d00b00238e88b3cd670b9bf91c314a2f72ef2570336cfd6ac1c77b2"

RPROVIDES:${PN} += "libfsext-devel \
pkgconfig-libfsext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsext1"

inherit rpm
