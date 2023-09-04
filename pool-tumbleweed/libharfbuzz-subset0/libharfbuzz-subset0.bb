SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the subset library"
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "libharfbuzz-subset0-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "4dc6693b7ceeca340382ddd7f385220a2220ad715e80e566a8b28df8e6baa6fc88220902bd0a6db0548d9e62d32154445e75fb7551689b691d89bd95f89f9cf5"

RPROVIDES:${PN} += "libharfbuzz-subset.so.0 \
libharfbuzz-subset0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
