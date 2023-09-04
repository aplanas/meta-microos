SUMMARY = "Deterministic allocation and freeing of scarce resources"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <http://www.stackage.org/package/resourcet>."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-1.2.6-2.8.aarch64.rpm"
RPM_HASH = "d26e1142c479b51c503a3dcf5e7962d8c28941db214e08ea580096601600dc2fd4b8202f2c40bb669ef13b6248981142679d60b3a49239c461537dae2b9a1d3e"

RPROVIDES:${PN} += "ghc-resourcet \
libHSresourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
