SUMMARY = "Binding to the Cairo library"
DESCRIPTION = "Cairo is a library to render high quality vector graphics. There exist various \
backends that allows rendering to Gtk windows, PDF, PS, PNG and SVG documents, \
amongst others."
LICENSE = "BSD-3-Clause"

PV = "0.13.8.2"

RPM_NAME = "ghc-cairo-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "80421551ebcc68dfc4c6676469ea0ab17e5cdc501bf944a5ad144db8ade3a78eddd2bdc92c02ed7023fd4c85924cd137d719b73ca743eb185642404c44a130dc"

RPROVIDES:${PN} += "ghc-cairo \
libHScairo-0.13.8.2-84nOBKgVLz3788JDxxB5om-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libc.so.6 \
libcairo.so.2 \
libgmp.so.10 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
