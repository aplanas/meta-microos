SUMMARY = "A library for hex dumps of ByteStrings"
DESCRIPTION = "This library generates pretty hex dumps of ByteStrings in the style of other \
common *nix hex dump tools."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-1.1-4.3.aarch64.rpm"
RPM_HASH = "609c04f2160b1ef878aa2abc1e251cfd7fa6f0b6d80b87922d0af08f8459d0b2000a1b6548e6940ce0d1bfe0ce2a774e4cd25423147bade1e068823d7eee0622"

RPROVIDES:${PN} += "ghc-pretty-hex \
libHSpretty-hex-1.1-6nqTsc1Xx7vJSzZ0xX5VyC-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
