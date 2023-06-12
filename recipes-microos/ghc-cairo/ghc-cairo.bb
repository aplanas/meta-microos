SUMMARY = "Binding to the Cairo library"
DESCRIPTION = "Cairo is a library to render high quality vector graphics. There exist various \
backends that allows rendering to Gtk windows, PDF, PS, PNG and SVG documents, \
amongst others."
LICENSE = "BSD-3-Clause"

PV = "0.13.8.2"

RPM_NAME = "ghc-cairo-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "80421551ebcc68dfc4c6676469ea0ab17e5cdc501bf944a5ad144db8ade3a78eddd2bdc92c02ed7023fd4c85924cd137d719b73ca743eb185642404c44a130dc"

RPROVIDES:${PN} += "ghc-cairo \
ghc-cairo(aarch-64) \
libHScairo-0.13.8.2-84nOBKgVLz3788JDxxB5om-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libz.so.1()(64bit)"

inherit rpm
