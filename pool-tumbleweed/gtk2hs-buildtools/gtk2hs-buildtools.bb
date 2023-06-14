SUMMARY = "Tools to build the Gtk2Hs suite of User Interface libraries"
DESCRIPTION = "This package provides a set of helper programs necessary to build the Gtk2Hs \
suite of libraries. These tools include a modified c2hs binding tool that is \
used to generate FFI declarations, a tool to build a type hierarchy that \
mirrors the C type hierarchy of GObjects found in glib, and a generator for \
signal declarations that are used to call back from C to Haskell. \
These tools are not needed to actually run Gtk2Hs programs."
LICENSE = "GPL-2.0-only"

PV = "0.13.8.3"

RPM_NAME = "gtk2hs-buildtools-0.13.8.3-2.3.aarch64.rpm"
RPM_HASH = "6ec87812f3b30d8a9e1015eb989a33054bfe72abb0698cfc487ee0920de2262dcc9d8c385fde98bb128fbabb7444ee260b42ea65af2f1225d33fd0affc5f07f2"

RPROVIDES:${PN} += "gtk2hs-buildtools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
