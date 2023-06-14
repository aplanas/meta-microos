SUMMARY = "Small Embeddable HTTP Server Library"
DESCRIPTION = "Headers, pkg-config files, so link and other development files for libmicrohttpd \
(Small Embeddable HTTP Server Library)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.77"

RPM_NAME = "libmicrohttpd-devel-0.9.77-1.1.aarch64.rpm"
RPM_HASH = "d177a7c5b5f8e547b62c1f84f25c2c8f25127d1c10a9680d61fbf4dd4d3c3611f0cac961ed42b13c7f17596179cc7f01798ab55333c1114a60f6a453d053711b"

RPROVIDES:${PN} += "libmicrohttpd-devel \
pkgconfig-libmicrohttpd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmicrohttpd12 \
pkgconfig \
pkgconfig-gnutls"

inherit rpm
