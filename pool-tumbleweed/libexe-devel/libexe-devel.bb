SUMMARY = "Development files for libexe"
DESCRIPTION = "Library to provide Microsoft EXE file support for the libyal family \
of libraries. libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libexe."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe-devel-20210424-4.6.aarch64.rpm"
RPM_HASH = "fb490dae8624f1d6139c623e7c4ca44555cf3ff0a785523cf38a9aa6dd4b6d03827cb49b15ff12317feab8e3e4ce6daead72c8902003152f359d9482428f9d21"

RPROVIDES:${PN} += "libexe-devel \
libexe-devel(aarch-64) \
pkgconfig(libexe)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libexe1"

inherit rpm
