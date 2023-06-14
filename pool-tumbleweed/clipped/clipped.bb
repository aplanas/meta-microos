SUMMARY = "Clipboard Manager"
DESCRIPTION = "Clipboard history manager for Elementary OS."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "clipped-1.1.1-1.18.aarch64.rpm"
RPM_HASH = "0cb59189f7e874263fa1872719f72340fdd97393870f9d1c82dcfeb1ec9b8a9291830a6cec4f56033f265353051944c8bdebf93882e09972d02c56f3fa39dbda"

RPROVIDES:${PN} += "clipped"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsqlite3.so.0"

inherit rpm
