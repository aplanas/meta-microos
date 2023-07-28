SUMMARY = "Tools from the HarfBuzz text shaping software"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides a set of tools for HarfBuzz."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "harfbuzz-tools-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "7ecd1f79edce2b9192af86e003f6bf8c8e57a58570d243da241e672e634502b936fc2defa3be0b57091eeb53cc208f9d5c3be972efa935a77e9d4bd5df25e1f0"

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
