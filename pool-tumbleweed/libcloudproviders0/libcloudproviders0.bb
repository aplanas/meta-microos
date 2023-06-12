SUMMARY = "Library to integrate cloud storage providers"
DESCRIPTION = "Cross desktop library for desktop integration of cloud storage \
providers and sync tools."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libcloudproviders0-0.3.1-3.3.aarch64.rpm"
RPM_HASH = "5b94679fd578e7d29452802bc59e6c46d2009f22a23ae6d814023fba8aef8734313e0fdeb70edda4a360eb56f69f254d754518822d002b1624d9f4cdf9ed4427"

RPROVIDES:${PN} += "libcloudproviders.so.0()(64bit) \
libcloudproviders0 \
libcloudproviders0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
