SUMMARY = "A Featureful Unicode Character Map"
DESCRIPTION = "Gucharmap is a featureful unicode character map."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "15.0.4"

RPM_NAME = "gucharmap-15.0.4-1.1.aarch64.rpm"
RPM_HASH = "44f78d2b7fb5c0835b5ffae71848b4104b9d42ad91a53584a9cb1ca43aa36d75afb7ad63d4c24294e7c6690d44408dabe081e8ef284d71419ed0f5a182601a23"

RPROVIDES:${PN} += "gucharmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgucharmap-2-90.so.7 \
libpango-1.0.so.0"

inherit rpm
