SUMMARY = "Binding to the GLIB library for Gtk2Hs"
DESCRIPTION = "GLib is a collection of C data structures and utility functions for the GObject \
system, main loop implementation, for strings and common data structures \
dealing with Unicode. This package only binds as much functionality as required \
to support the packages that wrap libraries that are themselves based on GLib."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-glib-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "25a4d20655390ecab39e3879f33d4d241de7ae59dce220c2e1d33d84cde8ccc7b8a9e739c4997a6b2f7f10984b3211b7c4c6c1e2f32217801115bd92b57ae2e7"

RPROVIDES:${PN} += "ghc-glib \
libHSglib-0.13.10.0-FwtjszetdFF6KErN1CKeSg-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libc.so.6 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
