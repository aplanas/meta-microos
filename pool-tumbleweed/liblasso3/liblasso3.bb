SUMMARY = "Lasso runtime libraries"
DESCRIPTION = "This package contains the runtime libraries for lasso (Liberty Alliance Single Sign On)."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "liblasso3-2.8.2-1.4.aarch64.rpm"
RPM_HASH = "355a49aae128666b41b24b29f55364ef380f9eaa0e663e79a62e1a8c95553919f45be48229c32cb82830b300014a9c39269b885725993bc6b7dc12ad8ca322f1"

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
