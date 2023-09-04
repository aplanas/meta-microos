SUMMARY = "Simple cryptographic random related types"
DESCRIPTION = "Simple cryptographic random related types."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-0.0.9-6.3.aarch64.rpm"
RPM_HASH = "c80bfdd0ba79224210083b77bc0edf0cb81e4afa5c36f1fe6169abceaf6b5124bc350a99c1cad1a430030dfc72b32f45f083cd133437950659c6b0ef4482a7d3"

RPROVIDES:${PN} += "ghc-crypto-random \
libHScrypto-random-0.0.9-EARwXMpyWawUPhdi0weks-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbyteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSsecuremem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
