SUMMARY = "Abstraction to an auto scrubbing and const time eq, memory chunk"
DESCRIPTION = "SecureMem is similar to ByteString, except that it provides a memory chunk that \
will be auto-scrubbed after it run out of scope."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-0.1.10-4.2.aarch64.rpm"
RPM_HASH = "dfc443e806534d94d7e338e0208a46d88ce64c8ab3a987a92d695a8efad81d47b8603ba2e1459791710ef86a33be4d7ff66ebdb0980eb206f86eff042ceac056"

RPROVIDES:${PN} += "ghc-securemem \
libHSsecuremem-0.1.10-BbcWu3otOS6JQaPW3JfszZ-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
