SUMMARY = "Library for Crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "libgcr-3-1-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "888b71286c9cc80690994c35f0aad73111303aac6f4ddbac39ffca636440d0917a884fc4132005d9cb7042307918619fafe13d72055f6ca5cdec02c860ba4555"

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
