SUMMARY = "A collection of helpers for building DLNA applications"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "gupnp-dlna-tools-0.12.0-1.10.aarch64.rpm"
RPM_HASH = "2102079a5a0a893961e97bdf50113ab2fdf951db64105e8d115cf39f7c71c2707dad2e4e277d3b9f75ccc22b31f23a562797cbbf962b681195ba702fc1d77e2b"

RPROVIDES:${PN} += "gupnp-dlna-tools \
gupnp-dlna-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgupnp-dlna-2.0.so.4()(64bit)"

inherit rpm
