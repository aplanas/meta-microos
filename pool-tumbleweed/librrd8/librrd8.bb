SUMMARY = "Round Robin Database tool library"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "librrd8-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "fcabfd51407b8edbaae91cc73c548818411525fa22c93a5b50d78279f7189e659048e79631c661c37b808bd436598f3d6ec45042ddc1ce3a833ec19aa43875d0"

RPROVIDES:${PN} += "librrd.so.8 \
librrd8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbi.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libxml2.so.2"

inherit rpm
