SUMMARY = "C++ interface for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.50.1"

RPM_NAME = "libpangomm-2_48-1-2.50.1-1.4.aarch64.rpm"
RPM_HASH = "28e8839fce737b524d9303e3ac2cb4a0c30f30ca7305676fee762b22cab49b93ece03cd2464a10c96927ab328009bbf21a889f5491134794b8c2ae3db73d7348"

RPROVIDES:${PN} += "libpangomm-2-48-1 \
libpangomm-2.48.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairomm-1.16.so.1 \
libgcc-s.so.1 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
