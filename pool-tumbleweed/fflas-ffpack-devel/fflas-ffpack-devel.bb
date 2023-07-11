SUMMARY = "Development files for FFLAS-FFPACK"
DESCRIPTION = "The FFLAS-FFPACK library provides functionalities for dense linear \
algebra over word size prime finite field. \
 \
This subpackage contains the include files for \
developing against the fflas-ffpack library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "fflas-ffpack-devel-2.5.0-1.6.aarch64.rpm"
RPM_HASH = "8a0f9122ad8a2568b7fb7d9c9ac29f199b24665860e1c1e881871503c55ccfc384fd4cf7ad0bd5c61f6687a4f78ee6d3d739de732eb0d8e6e8480013e6429027"

RPROVIDES:${PN} += "fflas-ffpack-devel \
pkgconfig-fflas-ffpack"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
pkgconfig-givaro"

inherit rpm
