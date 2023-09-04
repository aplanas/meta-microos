SUMMARY = "GObject wrapper around the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the GObject library."
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "libharfbuzz-gobject0-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "049ab5b744fe9ba270e48cd95051e5976800ca6d8cfd9ae050332b09b2fcc6edbff0b76d76c5e13e828fe6e04e41168046e52eb983a6aa6a8787491fb5236744"

RPROVIDES:${PN} += "libharfbuzz-gobject.so.0 \
libharfbuzz-gobject0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0"

inherit rpm
