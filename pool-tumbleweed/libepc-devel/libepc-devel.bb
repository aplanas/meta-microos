SUMMARY = "Easy Publish and Consume Library"
DESCRIPTION = "Development headers for libepc. \
 \
The Easy Publish and Consume library provides methods to publish \
data via HTTPS, announce data via DNS-SD, re-find and consume this \
data."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.6"

RPM_NAME = "libepc-devel-0.4.6-6.6.aarch64.rpm"
RPM_HASH = "0e7395e8fc90fbb632b198d61e72b009729bef6c7d887539a991d9c4f82dcbe5901b24131501522dc56a2dd1ca24c328b23cb947d9bf266ed79aa0b9443d7e0e"

RPROVIDES:${PN} += "libepc-devel \
libepc-devel(aarch-64) \
pkgconfig(libepc-1.0) \
pkgconfig(libepc-ui-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libepc-1_0-3 \
pkgconfig(avahi-client) \
pkgconfig(avahi-glib) \
pkgconfig(gnutls) \
pkgconfig(gtk+-3.0) \
pkgconfig(libepc-1.0) \
pkgconfig(libsoup-2.4)"

inherit rpm
