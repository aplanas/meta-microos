SUMMARY = "MATE Weather shared libraries"
DESCRIPTION = "libmateweather is a library to access weather information from \
online services for numerous locations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "libmateweather1-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "d9ace93cbcfabbfd9f1ecb28003f69e97543fae3d1e39fb8f6e987e786317a9580214d61a6da546fb28fc09efa7eb585ed1415f2798fe8471a14b18223a1b44f"

RPROVIDES:${PN} += "libmateweather \
libmateweather.so.1 \
libmateweather1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libsoup-2.4.so.1 \
libxml2.so.2 \
mateweather-common"

inherit rpm
