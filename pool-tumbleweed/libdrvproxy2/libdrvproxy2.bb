SUMMARY = "Administration library for iODBC"
DESCRIPTION = "This package provides libdrvproxy for administering iODBC"
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.14"

RPM_NAME = "libdrvproxy2-3.52.14-2.6.aarch64.rpm"
RPM_HASH = "21c41f2ba01e913223409a20a54e1076b73ba456d93d747664f0cf3cc0a73f431133aff68c58023d6a81d4b69b059088e16086f7887e5e180e3bca94309f7c76"

RPROVIDES:${PN} += "libdrvproxy.so.2 \
libdrvproxy2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libiodbcadm.so.2 \
libiodbcinst.so.2"

inherit rpm
