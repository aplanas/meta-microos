SUMMARY = "Library to get online weather information"
DESCRIPTION = "This is a library to download weather information from online sources."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "libgweather-4-0-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "0a68c0169e2dba97d2b14938cdc1ba7d002cc3fe9c88288943ad6b8519c30a875618e7d06a14e4c555f2902215699b808fd3fa0898f10542276d77236adb8935"

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
