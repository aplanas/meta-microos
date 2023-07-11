SUMMARY = "Development files for libfwsi"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries.  libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwsi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "libfwsi-devel-20230114-1.7.aarch64.rpm"
RPM_HASH = "ae9cbd6ebfc09a314a9be5f95cb7d17623fd98700b64ef34f4bc05c83ddb3478897813f27fb90598cc4f9a3ef76da900ddec90d58b89d0286629c18e0742507d"

RPROVIDES:${PN} += "libfwsi-devel \
pkgconfig-libfwsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwsi1"

inherit rpm
