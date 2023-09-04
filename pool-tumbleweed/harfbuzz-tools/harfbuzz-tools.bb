SUMMARY = "Tools from the HarfBuzz text shaping software"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides a set of tools for HarfBuzz."
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "harfbuzz-tools-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "d90446d0044cb6a6f2ca43551e1109c83685f2415e942e0e0afb1f5309aaea1d43e45d9fa0869e0470a61807659f1f7d1e15b21261c431ee405b2ac7defc59cb"

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
