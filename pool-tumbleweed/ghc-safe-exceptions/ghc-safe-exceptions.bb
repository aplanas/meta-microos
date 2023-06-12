SUMMARY = "Safe, consistent, and easy exception handling"
DESCRIPTION = "Safe, consistent, and easy exception handling."
LICENSE = "MIT"

PV = "0.1.7.3"

RPM_NAME = "ghc-safe-exceptions-0.1.7.3-2.2.aarch64.rpm"
RPM_HASH = "1e4048d69cb9effec149a047f20231a2671e5003a17e9318dd5c53730773f7c21cd6ca8b0ab55959fbd5227692edc780e43307ff649f19aeb1c1596ddfb0da1e"

RPROVIDES:${PN} += "ghc-safe-exceptions \
ghc-safe-exceptions(aarch-64) \
libHSsafe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
