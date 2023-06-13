SUMMARY = "Development files for QOAuth"
DESCRIPTION = "QOAuth supports interaction with OAuth-powered network services, \
in the style of Qt libraries. \
 \
This package contains files for developing applications using QOAuth."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "qoauth-qt5-devel-2.0.0-3.22.aarch64.rpm"
RPM_HASH = "80f063ac7ff8d649935b18c8a011b2a558d7b6c921cbacdcbbe4bcbae1781652a1f5c12908fa169b560a98b9b2565a35403deb1a531e17d59a2fcf30da1a9826"

RPROVIDES:${PN} += "pkgconfig(qoauth) \
qoauth-qt5-devel \
qoauth-qt5-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqoauth2 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Network) \
pkgconfig(qca2-qt5)"

inherit rpm
