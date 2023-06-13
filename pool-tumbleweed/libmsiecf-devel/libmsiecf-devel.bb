SUMMARY = "Development files for libmsiecf"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmsiecf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf-devel-20221024-3.5.aarch64.rpm"
RPM_HASH = "293c0c59de4ef77c6d95cb6699b4c1ff71c2381e7351547396beec80907c882385cfa5f7b0679a4841b1ca72e86f27494cad007845075fb32f0e0ddb76ca8b6f"

RPROVIDES:${PN} += "libmsiecf-devel \
libmsiecf-devel(aarch-64) \
pkgconfig(libmsiecf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmsiecf1"

inherit rpm
