SUMMARY = "Development files for libolecf"
DESCRIPTION = "libolecf is a library to access the OLE 2 Compound File (OLECF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libolecf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf-devel-20221024-4.1.aarch64.rpm"
RPM_HASH = "359a83eec649e4f1b76a46307f15203d063346970c9dfda5e934d978c61cad5a7eca7942f3ab5e9b837de187c7d171d8e9e027530307ddfb97831e33a82c214e"

RPROVIDES:${PN} += "libolecf-devel \
pkgconfig-libolecf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libolecf1"

inherit rpm
