SUMMARY = "RSS/Atom parsing library - development headers"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. This \
package contains development headers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "syndication-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8f6bc5d5e6e0f65b85c05748bb5f20c008962f26171e2c65231d68e25393f5cee9dc45eab11b06f5dcd5faa62a861da56e81b766e53f880e6ae3fe8116f77d10"

RPROVIDES:${PN} += "cmake-KF5Syndication \
syndication-devel"

RDEPENDS:${PN} += "libKF5Syndication5"

inherit rpm
