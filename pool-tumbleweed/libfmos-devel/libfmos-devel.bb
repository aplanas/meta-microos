SUMMARY = "Development files for libfmos"
DESCRIPTION = "libfmos is a library for MacOS data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfmos."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "libfmos-devel-20230707-1.1.aarch64.rpm"
RPM_HASH = "136a37da00faa6f7da333df588cf90c82ec342edfe7909f928b4d2c85fdb6a4d4bc32674c2b7ccc14c3016948a894993d6ddbde57019e9b2532353f789782f7d"

RPROVIDES:${PN} += "libfmos-devel \
pkgconfig-libfmos"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmos1"

inherit rpm
