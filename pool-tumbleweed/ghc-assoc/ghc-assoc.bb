SUMMARY = "Swap and assoc: Symmetric and Semigroupy Bifunctors"
DESCRIPTION = "Provides generalisations of 'swap :: (a,b) -> (b,a)' and 'assoc :: ((a,b),c) -> \
(a,(b,c))' to 'Bifunctor's supporting similar operations (e.g. \
'Either', 'These')."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-assoc-1.1-1.6.aarch64.rpm"
RPM_HASH = "c1df9f4d967895ca3c388a4b14bda0869424d5210986baea3b34f01e982ece3b52328ac5e5ca40320b57ffaa7d7b452aea8966ace68641f2720bf6eaa07a57b1"

RPROVIDES:${PN} += "ghc-assoc \
libHSassoc-1.1-J44kuPbAMT5GyespKCFdbT-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
