SUMMARY = "A Featureful Unicode Character Map -- Library"
DESCRIPTION = "Gucharmap is a featureful unicode character map. \
 \
This package contains a library to use the character map."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "15.0.4"

RPM_NAME = "libgucharmap_2_90-7-15.0.4-1.1.aarch64.rpm"
RPM_HASH = "44b47ace6caeda21cf3e5ab804c578a3c6f810aedb3e26ef46f6180c4c321a31110392e69bbf975b94df5f20a9f240f705c77699bf546c7b4e434cb6708b829b"

RPROVIDES:${PN} += "libgucharmap-2-90-7 \
libgucharmap-2-90.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpcre2-8.so.0"

inherit rpm
