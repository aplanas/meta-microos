SUMMARY = "Development files for libolecf"
DESCRIPTION = "libolecf is a library to access the OLE 2 Compound File (OLECF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libolecf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf-devel-20221024-3.8.aarch64.rpm"
RPM_HASH = "3093938df5bad4b5f43d5bbc9b2c4ff82b792453aad41f29b2586be4becf4d809069f2d39f9c6a01abee553b25265526f5a750c28504a8869f00932429fe454c"

RPROVIDES:${PN} += "libolecf-devel \
pkgconfig-libolecf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libolecf1"

inherit rpm
