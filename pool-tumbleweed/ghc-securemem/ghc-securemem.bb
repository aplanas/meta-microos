SUMMARY = "Abstraction to an auto scrubbing and const time eq, memory chunk"
DESCRIPTION = "SecureMem is similar to ByteString, except that it provides a memory chunk that \
will be auto-scrubbed after it run out of scope."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-0.1.10-4.2.aarch64.rpm"
RPM_HASH = "dfc443e806534d94d7e338e0208a46d88ce64c8ab3a987a92d695a8efad81d47b8603ba2e1459791710ef86a33be4d7ff66ebdb0980eb206f86eff042ceac056"

RPROVIDES:${PN} += "ghc-securemem \
ghc-securemem(aarch-64) \
libHSsecuremem-0.1.10-BbcWu3otOS6JQaPW3JfszZ-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so()(64bit) \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
