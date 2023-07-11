SUMMARY = "RSS/Atom parsing library - development headers"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. This \
package contains development headers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "syndication-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "a3fc0fdc618d70a6a5f994ffe53365cd8c46e82ea677af9409d2d928dd84bc13ca19613ca56ed4b13a6d25edcf41186384cf8e18848744490a53757171154925"

RPROVIDES:${PN} += "cmake-KF5Syndication \
syndication-devel"

RDEPENDS:${PN} += "libKF5Syndication5"

inherit rpm
