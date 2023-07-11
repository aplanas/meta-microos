SUMMARY = "Library to get online weather information"
DESCRIPTION = "This is a library to download weather information from online sources."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "libgweather-4-0-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "fc45c361af8dc529a6ec96499c496e24f633012ee53465265a5ddafe274997c120b9db55ade985edf167926b2febbbdcb704c36246e289bf05236563aeadaa4b"

RPROVIDES:${PN} += "libgweather-4-0 \
libgweather-4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gweather4-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-3.0.so.0 \
libxml2.so.2"

inherit rpm
