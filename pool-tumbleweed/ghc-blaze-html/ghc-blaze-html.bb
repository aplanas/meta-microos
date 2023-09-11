SUMMARY = "A blazingly fast HTML combinator library for Haskell"
DESCRIPTION = "A blazingly fast HTML combinator library for the Haskell programming language. \
The Text.Blaze module is a good starting point, as well as this tutorial: \
<http://jaspervdj.be/blaze/tutorial.html>."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-0.9.1.2-10.1.aarch64.rpm"
RPM_HASH = "ba20a1410b3e41372298e545d230a17070598523433960442633da215ba32442741f1192e2ad218c75126df530b5df4da5069d7c9f88e7a6a9a3ae48dba61de4"

RPROVIDES:${PN} += "ghc-blaze-html \
libHSblaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND-ghc9.4.6.so \
libHSblaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
