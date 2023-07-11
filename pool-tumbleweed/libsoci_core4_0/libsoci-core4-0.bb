SUMMARY = "The C++ Database Access Library"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_core4_0-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "60c50d3731fc595acca213d809008eb589463a5875a59f496814faf4a7acd202785ee9ef2f4e996adcea6dab80300775c465a503d792e888f7992fd1fa56079a"

RPROVIDES:${PN} += "libsoci-core.so.4.0 \
libsoci-core4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsoci4-0-backend \
libstdc++.so.6"

inherit rpm
