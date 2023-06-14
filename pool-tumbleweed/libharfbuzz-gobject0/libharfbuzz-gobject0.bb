SUMMARY = "GObject wrapper around the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the GObject library."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "libharfbuzz-gobject0-7.3.0-1.2.aarch64.rpm"
RPM_HASH = "93e7f26033d0ef6d9bd1e7aa5630ca7dd1441fcd27b1762aa1ac967687a6e7e682e0e5b4743214d34a590669d417f45238ad602c8a3bfa7a6d30fa70bb75948f"

RPROVIDES:${PN} += "libharfbuzz-gobject.so.0 \
libharfbuzz-gobject0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0"

inherit rpm
