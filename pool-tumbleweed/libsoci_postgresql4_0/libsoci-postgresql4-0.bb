SUMMARY = "PostgreSQL back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for PostgreSQL."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_postgresql4_0-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "ec58495200cab7d3e44e106f80dc994901613e53372a1970de7d0f74db7c9e197d3589fce2c8c4f28173d8e61f9e070555119d0a971422570100027ebc18a366"

RPROVIDES:${PN} += "libsoci-postgresql.so.4.0 \
libsoci-postgresql4-0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libsoci-core.so.4.0 \
libstdc++.so.6"

inherit rpm
