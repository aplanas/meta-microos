SUMMARY = "Administration library for iODBC"
DESCRIPTION = "This package provides libiodbcadm for administering iODBC"
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.14"

RPM_NAME = "libiodbcadm2-3.52.14-2.6.aarch64.rpm"
RPM_HASH = "80fc90c70b086b464ee83cde9b65e7b145e150dccff06c533ebd387b21866cce6dfd0e634807f8e8524a974283ea64cf45aa405f177bb340eb0801940f180b0b"

RPROVIDES:${PN} += "libiodbcadm.so.2()(64bit) \
libiodbcadm2 \
libiodbcadm2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libiodbc.so.2()(64bit) \
libiodbcinst.so.2()(64bit)"

inherit rpm
