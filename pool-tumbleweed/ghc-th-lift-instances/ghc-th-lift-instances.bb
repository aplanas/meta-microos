SUMMARY = "Lift instances for template-haskell for common data types"
DESCRIPTION = "Most data types in the haskell platform do not have Lift instances. \
This package provides orphan instances for containers, text, bytestring and \
vector. It also provides compat instances for older versions of \
'template-haskell' \
 \
Note that <https://hackage.haskell.org/package/th-lift th-lift> package \
provides Template Haskell based derivation of 'Lift' instances (when you cannot \
use 'DeriveLift' extension), and \
<https://hackage.haskell.org/package/th-orphans th-orphans> package provides \
instances for TH datatypes."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-0.1.20-2.4.aarch64.rpm"
RPM_HASH = "a9757d7290b28f2e62a33854376c4210ba6dafcfe35b54792fc56d9f9e74737802578b8aad62fbae3e08c3ee5b8b006be6db96e947583c706347ff00534a8817"

RPROVIDES:${PN} += "ghc-th-lift-instances \
libHSth-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHSth-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
