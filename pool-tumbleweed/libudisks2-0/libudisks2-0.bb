SUMMARY = "Dynamic library to access the UDisksd daemon"
DESCRIPTION = "This package contains the dynamic library, which provides \
access to the UDisksd daemon."
LICENSE = "LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "372986d0435148f19848d6db8699ef3ade980e957c3ec1bbd76d5e2d2878d8d2e1d00abdee2c3c1d80b950f23ff6cd9c9861ef978f951f97f571f4ce8e1a4825"

RPROVIDES:${PN} += "libudisks2-0 \
libudisks2-0(aarch-64) \
libudisks2.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
