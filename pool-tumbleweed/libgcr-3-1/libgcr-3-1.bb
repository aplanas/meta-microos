SUMMARY = "Library for Crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "libgcr-3-1-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "f7600ae6bb40730a46631dd430579b0eec4e486435b52aa0eb88d7bd93d93ce6efc7501cfbe5af613b208999d7d54d65ec6667c753c06b9c99a9e32759e938f2"

RPROVIDES:${PN} += "gcr3 \
libgcr-3-1 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcr-data \
gcr-prompter \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgck-1.so.0 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libp11-kit.so.0 \
libpango-1.0.so.0"

inherit rpm
