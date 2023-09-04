SUMMARY = "Abstraction to an auto scrubbing and const time eq, memory chunk"
DESCRIPTION = "SecureMem is similar to ByteString, except that it provides a memory chunk that \
will be auto-scrubbed after it run out of scope."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-0.1.10-4.5.aarch64.rpm"
RPM_HASH = "dc935c5767060a6ad8e2923f075878512f2a001af441accb01ae0ff98801c0bef01f9b28ae2edb9499c5298102dcf93008633426092c0e15fed6bd1c378fbb66"

RPROVIDES:${PN} += "ghc-securemem \
libHSsecuremem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4-ghc9.4.6.so"

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
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
