SUMMARY = "NGINX module for NGINX Javascript"
DESCRIPTION = "njs is a subset of the JavaScript language that allows extending \
nginx functionality."
LICENSE = "BSD-2-Clause"

PV = "0.7.12"

RPM_NAME = "nginx-module-njs-0.7.12-1.2.aarch64.rpm"
RPM_HASH = "9ee4859ad0fbc1322f584be0c6561679e8e9c1e6f44f05c9cabc0ab24be36f0f79329aacaa329811a526b977f1d3d81b5e9e217f1311b62d9804334d6457cef5"

RPROVIDES:${PN} += "nginx-module-njs \
nginx-module-njs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.4)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
nginx"

inherit rpm
