SUMMARY = "Library to integrate cloud storage providers"
DESCRIPTION = "Cross desktop library for desktop integration of cloud storage \
providers and sync tools."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libcloudproviders0-0.3.1-3.4.aarch64.rpm"
RPM_HASH = "de50b88438406cd38c0bff9132438fac613fca32fcd8288353ed5fc32b8001eb14be243ee888d8f2341bf26a5fe08d85e7891498924c2dd92a3e79af8c4ab88e"

RPROVIDES:${PN} += "libcloudproviders.so.0 \
libcloudproviders0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
