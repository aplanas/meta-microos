SUMMARY = "Development files for libolecf"
DESCRIPTION = "libolecf is a library to access the OLE 2 Compound File (OLECF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libolecf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf-devel-20221024-3.5.aarch64.rpm"
RPM_HASH = "7e18cfe74d00670121b2ae5176bc75781cadbf3eae289607d75c7b3dd8d80c17a0dc17f6feec2d9919f101317129baae60b3127ad92407eb0032a7b4c7225ab5"

RPROVIDES:${PN} += "libolecf-devel \
libolecf-devel(aarch-64) \
pkgconfig(libolecf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libolecf1"

inherit rpm
