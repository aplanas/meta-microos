SUMMARY = "Privacy Enhanced Mail (PEM) format reader and writer"
DESCRIPTION = "Privacy Enhanced Mail (PEM) format reader and writer."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-0.2.4-8.3.aarch64.rpm"
RPM_HASH = "c4809fa744c51d51c652b9662253641d0f3e1a0a9ce54fdfcf7e4f41f22c61d1921fb71fbe5e7bef2c77a5f14997915da653b1f820c51eff589214e86dc9b578"

RPROVIDES:${PN} += "ghc-pem \
ghc-pem(aarch-64) \
libHSpem-0.2.4-GVwv4fsQYoEEDbQiUNwxns-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
