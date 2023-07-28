SUMMARY = "GObject wrapper around the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the GObject library."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "libharfbuzz-gobject0-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "326cd053c3574f18978b38c87efcb5f3edc8bf59d135cba6eeba22614fb8856cf1acd1a64b299245b5418576859e7e2831c279e5fd2e2396eeda2e2116e0639f"

RPROVIDES:${PN} += "libharfbuzz-gobject.so.0 \
libharfbuzz-gobject0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0"

inherit rpm
