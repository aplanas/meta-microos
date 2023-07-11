SUMMARY = "Empty back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains an empty back-end."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_empty4_0-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "634e60e8df063747bba429b890b675f9a567ee36a247d4ae00d16b6aae0f028ad69a85d9b14088359bebcfb4cc4e727fa226d341b9329608edf1edfc928ad2c7"

RPROVIDES:${PN} += "libsoci-empty.so.4.0 \
libsoci-empty4-0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsoci-core.so.4.0 \
libstdc++.so.6"

inherit rpm
