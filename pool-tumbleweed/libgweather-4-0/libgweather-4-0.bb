SUMMARY = "Library to get online weather information"
DESCRIPTION = "This is a library to download weather information from online sources."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "libgweather-4-0-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "afa757124e1297bb6d13e994b262a3768ac7528ec7daa0f1e3c0c84d346b525de488fe370bc3965cea670f2d099a26cf14f1b746704c47c6ec240985d538ae45"

RPROVIDES:${PN} += "libgweather-4-0 \
libgweather-4-0(aarch-64) \
libgweather-4.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gweather4-data \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgeocode-glib-2.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libsoup-3.0.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
