SUMMARY = "Intelligent predictive text entry platform (tools and demos)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the tools required to generate custom statistical data used by the presage predictive text engine to generate predictions. \
 \
This package also contains simple demonstration programs and simulator."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "presage-0.9.1-13.1.aarch64.rpm"
RPM_HASH = "e9ffa279f7647951c405b24b8709bef16cd2b3bd2d866a08acf9eb34c24a6820d9e5c2e2176e50194599fa240f26d4f938e56b94e694cacf8589a80b38bf5ce3"

RPROVIDES:${PN} += "presage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpresage.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
