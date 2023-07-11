SUMMARY = "Qt Library that wraps the gpodder.net Web API"
DESCRIPTION = "libmygpo-qt5 is a Qt Library that wraps the gpodder.net Web API (http://wiki.gpodder.org/wiki/Web_Services/API_2) \
 \
v1.0 wraps nearly every Request from the gpodder.net API except: \
- Simple API Calls Downloading subscription Lists & Uploading subscription Lists \
- Retrieving Subscription Changes (you should use 'Retrieving Updates for a given Device' instead)"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libmygpo-qt5-devel-1.1.0-2.24.aarch64.rpm"
RPM_HASH = "b133fdb02de13d9438156ded00d8718a9cdc3aa5cfa287d01098ff79661e4ab038173071a7211f7eacaeda61cac9cc4bfb93358cc37d8ecb230c3af98ed9bd9b"

RPROVIDES:${PN} += "cmake-Mygpo-qt5 \
libmygpo-qt5-devel \
pkgconfig-libmygpo-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmygpo-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
