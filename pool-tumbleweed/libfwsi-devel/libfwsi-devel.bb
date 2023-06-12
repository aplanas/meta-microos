SUMMARY = "Development files for libfwsi"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries.  libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwsi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "libfwsi-devel-20230114-1.4.aarch64.rpm"
RPM_HASH = "64248441e4473ae726250ee489e978f148d085b5407d9a225253e119351101ee9fd488cc10a87aab75c40ca1a7dd8621e9e39a76bf5418432c9039940e63e51e"

RPROVIDES:${PN} += "libfwsi-devel \
libfwsi-devel(aarch-64) \
pkgconfig(libfwsi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwsi1"

inherit rpm
