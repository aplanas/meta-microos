SUMMARY = "Tools to build the Gtk2Hs suite of User Interface libraries"
DESCRIPTION = "This package provides a set of helper programs necessary to build the Gtk2Hs \
suite of libraries. These tools include a modified c2hs binding tool that is \
used to generate FFI declarations, a tool to build a type hierarchy that \
mirrors the C type hierarchy of GObjects found in glib, and a generator for \
signal declarations that are used to call back from C to Haskell. \
These tools are not needed to actually run Gtk2Hs programs."
LICENSE = "GPL-2.0-only"

PV = "0.13.10.0"

RPM_NAME = "gtk2hs-buildtools-0.13.10.0-1.3.aarch64.rpm"
RPM_HASH = "e4804132d38d9b405a034d7e747b325b05ee9e1ac64c6c8e2444be4c993b70fdb86341fc9c70519c7ed13e00b47d284d4ce8f478a54a2c56ed15bbfd949b724b"

RPROVIDES:${PN} += "gtk2hs-buildtools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
