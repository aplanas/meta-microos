SUMMARY = "Lasso runtime libraries"
DESCRIPTION = "This package contains the runtime libraries for lasso (Liberty Alliance Single Sign On)."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "liblasso3-2.8.2-1.3.aarch64.rpm"
RPM_HASH = "35052c5dc1e76dd414c8c78b0000386604e6edea9c1130151f5f7899cdc55aeda55f43d99d3d4648252f40ade9c91931eb22d753e1ad9c7c5201530d52b355c3"

RPROVIDES:${PN} += "liblasso.so.3 \
liblasso3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.2 \
libxmlsec1-openssl.so.1 \
libxmlsec1.so.1 \
libxslt.so.1 \
libz.so.1"

inherit rpm
