SUMMARY = "Development files for libfwsi"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries.  libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwsi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "libfwsi-devel-20230710-1.1.aarch64.rpm"
RPM_HASH = "10d6397a90929e027c0b828abedf0c5c19cde39e5a0f6469455d2f63b10528b06e63530434da11736dc9b20ffea7a3b1bde5bf2af8a65dc2a2fe1a4d55d1bd5f"

RPROVIDES:${PN} += "libfwsi-devel \
pkgconfig-libfwsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwsi1"

inherit rpm
