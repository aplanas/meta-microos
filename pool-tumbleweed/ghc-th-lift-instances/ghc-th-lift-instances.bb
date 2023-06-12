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

RPM_NAME = "ghc-th-lift-instances-0.1.20-2.2.aarch64.rpm"
RPM_HASH = "7069b6ff820b8d04a73fee86af330088d741411cb916cba3351c34a8d521bdc2a580b49de03ca2f29c628d16eb33bc0a0463a97a2da539389e12baaae51c29a9"

RPROVIDES:${PN} += "ghc-th-lift-instances \
ghc-th-lift-instances(aarch-64) \
libHSth-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so()(64bit) \
libHSth-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
