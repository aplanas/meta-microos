SUMMARY = "Development files for libmsiecf"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmsiecf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf-devel-20221024-3.7.aarch64.rpm"
RPM_HASH = "ee0f9ba5204209d4842f23eb3835de98ee8fd165dc4bf1e7c048ff6f8ea0269224012b2a1620f6b1f4a112b59d9368e6ef9997b362babb28761b31c626b5d911"

RPROVIDES:${PN} += "libmsiecf-devel \
pkgconfig-libmsiecf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmsiecf1"

inherit rpm
