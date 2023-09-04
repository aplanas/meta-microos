SUMMARY = "Monadic parser combinators"
DESCRIPTION = "This is an industrial-strength monadic parser combinator library. \
Megaparsec is a feature-rich package that tries to find a nice balance between \
speed, flexibility, and quality of parse errors."
LICENSE = "BSD-2-Clause"

PV = "9.3.1"

RPM_NAME = "ghc-megaparsec-9.3.1-1.6.aarch64.rpm"
RPM_HASH = "130ff641e62069b823c02ab64181740f6926d9f6cf26a7c2906ec930ea2cf49cf4c39c631f535c642376d9cdc90a18c9db44d9e5b23e68c8c29272e556304e3d"

RPROVIDES:${PN} += "ghc-megaparsec \
libHSmegaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
