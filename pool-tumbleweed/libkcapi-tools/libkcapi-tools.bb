SUMMARY = "Linux Kernel Crypto API User Space Tools"
DESCRIPTION = "libkcapi user space tools to access certain hash algorithms."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libkcapi-tools-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "f13e62f380e137e9d094f162da72d78ca72db1d9b5cf2dee43e2a981904433f475e02764bf256eaaba72c5cf10c7e0d4a863666a581a19dec30bd27186719356"

RPROVIDES:${PN} += "libkcapi-tools \
libkcapi-tools(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkcapi.so.1()(64bit) \
libkcapi.so.1(LIBKCAPI_0.12.0)(64bit) \
libkcapi.so.1(LIBKCAPI_0.14.0)(64bit) \
libkcapi.so.1(LIBKCAPI_1.1.0)(64bit) \
libkcapi.so.1(LIBKCAPI_1.3.0)(64bit) \
libkcapi.so.1(LIBKCAPI_1.3.1)(64bit)"

inherit rpm
