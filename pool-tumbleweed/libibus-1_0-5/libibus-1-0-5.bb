SUMMARY = "IBus libraries"
DESCRIPTION = "This package contains the libraries for IBus"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "libibus-1_0-5-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "dc28613fad29b4a1a1a2b943ba05a9198fb925578658504644db3b5b02f9711fc4e6211150479bef55552003bb1cb246e5a26e5b58202fb0f4c8a9c1611103b3"

RPROVIDES:${PN} += "libibus-1-0-5 \
libibus-1.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
