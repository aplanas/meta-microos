SUMMARY = "Tools to build the Gtk2Hs suite of User Interface libraries"
DESCRIPTION = "This package provides a set of helper programs necessary to build the Gtk2Hs \
suite of libraries. These tools include a modified c2hs binding tool that is \
used to generate FFI declarations, a tool to build a type hierarchy that \
mirrors the C type hierarchy of GObjects found in glib, and a generator for \
signal declarations that are used to call back from C to Haskell. \
These tools are not needed to actually run Gtk2Hs programs."
LICENSE = "GPL-2.0-only"

PV = "0.13.10.0"

RPM_NAME = "gtk2hs-buildtools-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "9f59af93629101eb93d0e129a793e37e915472fe6a3fa13e96cb3885a7a5140034c7e9cd8e175eeead8f3289ff0d1075af3675631ff00893a72dce7a202bc1bf"

RPROVIDES:${PN} += "gtk2hs-buildtools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
