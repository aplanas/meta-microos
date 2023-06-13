SUMMARY = "NETGEN examples"
DESCRIPTION = "Various example geometry data for NETGEN."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-examples-6.2.2301-1.4.noarch.rpm"
RPM_HASH = "6ae6bd550353023b2d611809c1113d58b7455f60db3afbf41b0274e10d0c5170800894345fbe85f6e2bf0ee6e0e4b46ac6b432dff6f9a6fec9ec0a596105e873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netgen-examples \
netgen:/usr/share/netgen/cube.geo"

RDEPENDS:${PN} += "netgen"

inherit rpm
