SUMMARY = "Development files for libfwsi"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries.  libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwsi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "libfwsi-devel-20230710-2.1.aarch64.rpm"
RPM_HASH = "7ea4de79139aae5431e4abbf4802f2a7e5fc6eba0e91acd5af900c81f44492174a6995916af62378a4c80a77a61dadd0c0bf30f8f77ee73f9142b4a4024dad9a"

RPROVIDES:${PN} += "libfwsi-devel \
pkgconfig-libfwsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwsi1"

inherit rpm
