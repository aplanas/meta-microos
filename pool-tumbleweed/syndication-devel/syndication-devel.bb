SUMMARY = "RSS/Atom parsing library - development headers"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. This \
package contains development headers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "syndication-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "4aeecd9e9b9e0c32048b868f9bbf34c555e9093f0b148a4fa7d3ead751097832e6c93b2f51fb423eda679a96e822338d826c90e2ce1f0511418376c759224e3a"

RPROVIDES:${PN} += "cmake-KF5Syndication \
syndication-devel"

RDEPENDS:${PN} += "libKF5Syndication5"

inherit rpm
