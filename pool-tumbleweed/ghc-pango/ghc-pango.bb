SUMMARY = "Binding to the Pango text rendering engine"
DESCRIPTION = "This package provides a wrapper around the Pango C library that allows \
high-quality rendering of Unicode text. It can be used either with Cairo to \
output text in PDF, PS or other documents or with Gtk+ to display text \
on-screen."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-pango-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "6d245f21df6fa8f532e89b0146ccf6111ce864b6215155a47a599ee0a9e5b78418aea5c73f8295e671821ca8757080ab04e2f4d3bbd546f5e044cfb431d2e42b"

RPROVIDES:${PN} += "ghc-pango \
libHSpango-0.13.10.0-FM47W5PFqW5BGqK9yscE4O-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScairo-0.13.10.0-B3UP0Vi5jIV99bUcWUsXgu-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSglib-0.13.10.0-FwtjszetdFF6KErN1CKeSg-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libz.so.1"

inherit rpm
