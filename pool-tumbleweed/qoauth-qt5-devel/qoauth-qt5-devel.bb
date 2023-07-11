SUMMARY = "Development files for QOAuth"
DESCRIPTION = "QOAuth supports interaction with OAuth-powered network services, \
in the style of Qt libraries. \
 \
This package contains files for developing applications using QOAuth."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "qoauth-qt5-devel-2.0.0-3.23.aarch64.rpm"
RPM_HASH = "5beb21e1445a1d9c0840e9a2dc5ac69f9601c1713b53f890a5b949b17c8f70207a657740288119cf3aa81b186caf43055ba1a935425be3509cc460dd4a7d7a25"

RPROVIDES:${PN} += "pkgconfig-qoauth \
qoauth-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqoauth2 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network \
pkgconfig-qca2-qt5"

inherit rpm
