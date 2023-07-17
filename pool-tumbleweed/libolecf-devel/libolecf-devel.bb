SUMMARY = "Development files for libolecf"
DESCRIPTION = "libolecf is a library to access the OLE 2 Compound File (OLECF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libolecf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf-devel-20221024-3.9.aarch64.rpm"
RPM_HASH = "2c6407ce02c9c7e61188a54cddf541795b409bc7e758a1eb9b8e18e17dae04a4848cb85092a5410eb6c1f8a05b1ffb208b161eaa8bf88b163b4c8b150d91ac98"

RPROVIDES:${PN} += "libolecf-devel \
pkgconfig-libolecf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libolecf1"

inherit rpm
