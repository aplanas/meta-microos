SUMMARY = "Binding to the GLIB library for Gtk2Hs"
DESCRIPTION = "GLib is a collection of C data structures and utility functions for the GObject \
system, main loop implementation, for strings and common data structures \
dealing with Unicode. This package only binds as much functionality as required \
to support the packages that wrap libraries that are themselves based on GLib."
LICENSE = "LGPL-2.1-only"

PV = "0.13.8.2"

RPM_NAME = "ghc-glib-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "66708e95011ec9f19a068da38ca39786777ab7b9c63fca68b51c7878b2f72e421a59fc4e40ed185c1f76426f5f5245484abd8750312c4bbaf090f6fb96bee766"

RPROVIDES:${PN} += "ghc-glib \
libHSglib-0.13.8.2-DQyux8etmkJKUbOUWF524Z-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libc.so.6 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
