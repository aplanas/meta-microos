SUMMARY = "A blazingly fast markup combinator library for Haskell"
DESCRIPTION = "Core modules of a blazingly fast markup combinator library for the Haskell \
programming language. The Text.Blaze module is a good starting point, as well \
as this tutorial: <http://jaspervdj.be/blaze/tutorial.html>."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-0.8.2.8-6.1.aarch64.rpm"
RPM_HASH = "82db7c928d4c8790d165bb45e31f410bc78fb0ec58b5f31a7ea43fe7079723f9840faf1e9c5455868ec32fafaae4cee312887c6ed326d27da843c4c10d8064f1"

RPROVIDES:${PN} += "ghc-blaze-markup \
libHSblaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
