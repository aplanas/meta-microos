SUMMARY = "Tools from the HarfBuzz text shaping software"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides a set of tools for HarfBuzz."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "harfbuzz-tools-7.3.0-1.2.aarch64.rpm"
RPM_HASH = "03c763868cca36bfd968fdc76f995796e6bc4400f8e45fd7fa33735da78d34323908b34f89093f8c7ec331e58aed98918d520467eac253c408e2b45392640392"

RPROVIDES:${PN} += "harfbuzz-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz-cairo.so.0 \
libharfbuzz-gobject.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
