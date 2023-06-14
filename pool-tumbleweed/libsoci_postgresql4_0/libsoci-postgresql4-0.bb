SUMMARY = "PostgreSQL back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for PostgreSQL."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_postgresql4_0-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "c826f486399790c22e499f4d0c3cc0b1515af2fb040436a43b921a65f369e62eb79fb44c53fbbdd7228d4156e78a6c74714fb7effb8557c9a311276068be5e2a"

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
