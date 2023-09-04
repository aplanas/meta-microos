SUMMARY = "Binding to the Cairo library"
DESCRIPTION = "Cairo is a library to render high quality vector graphics. There exist various \
backends that allows rendering to Gtk windows, PDF, PS, PNG and SVG documents, \
amongst others."
LICENSE = "BSD-3-Clause"

PV = "0.13.10.0"

RPM_NAME = "ghc-cairo-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "ee38a8f0258d4ddef4a5aac0a777118ab5e0b54a1c151c15fc312ee78aa6a644b5631b7ee764862880830b7159300af648d23c9e7a6544a515fcea8e735f7541"

RPROVIDES:${PN} += "ghc-cairo \
libHScairo-0.13.10.0-B3UP0Vi5jIV99bUcWUsXgu-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libc.so.6 \
libcairo.so.2 \
libgmp.so.10 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
