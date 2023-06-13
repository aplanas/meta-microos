SUMMARY = "Library to provide generic file value functions"
DESCRIPTION = "Library to provide generic file value functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220120"

RPM_NAME = "libfvalue1-20220120-3.4.aarch64.rpm"
RPM_HASH = "2a125799ad1734144c534980addb20f7cf2cef08b810715b60a6051db513238e044e37d9bd5df2ab5ced8e53b9ce66cc5e85b2ba1f308dc52ad5987c3a7786a4"

RPROVIDES:${PN} += "libfvalue.so.1()(64bit) \
libfvalue.so.1(V_20220120)(64bit) \
libfvalue1 \
libfvalue1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfwnt.so.1()(64bit) \
libfwnt.so.1(V_20220922)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
