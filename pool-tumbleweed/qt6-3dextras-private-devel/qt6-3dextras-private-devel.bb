SUMMARY = "Non-ABI stable API for the Qt 6 3DExtras library"
DESCRIPTION = "This package provides private headers of libQt63DExtras that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dextras-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5e7fa79fb560e365fea4852bd74057ab23a2abb87db2297b82bbcfcc87cb7ad8d1c06325bd96889b1a0332be64b81b5b1e5edb84ce30802f9103b35a4af713c5"

RPROVIDES:${PN} += "qt6-3dextras-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DExtras \
qt6-3dcore-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel"

inherit rpm
