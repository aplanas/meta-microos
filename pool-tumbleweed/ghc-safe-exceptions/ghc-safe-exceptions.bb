SUMMARY = "Safe, consistent, and easy exception handling"
DESCRIPTION = "Safe, consistent, and easy exception handling."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-0.1.7.4-1.2.aarch64.rpm"
RPM_HASH = "f9f2a0801ac8daac9fe0089b88ab6eaa369e833276e90964880bd090e7ac6048dc9aa365a97dfcd58eb4d4e37b7b4932c5e6e4236f6cc23777de2690f0a23153"

RPROVIDES:${PN} += "ghc-safe-exceptions \
libHSsafe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
