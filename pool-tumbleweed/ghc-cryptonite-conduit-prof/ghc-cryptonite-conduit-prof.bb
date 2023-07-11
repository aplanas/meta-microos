SUMMARY = "Haskell cryptonite-conduit profiling library"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-prof-0.2.2-9.4.aarch64.rpm"
RPM_HASH = "f458f3a7da989982e48dc413caac7baa0d8a7a08b7afb134d66d4934c6c5c27634544a369eddb11d1680502577cc71b8f3f7ced64a1ab4f219c05209629478e6"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-prof \
ghc-prof-cryptonite-conduit-0.2.2-KLKIUqp436hDQelLp9gzMp"

RDEPENDS:${PN} += "ghc-cryptonite-conduit-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-exceptions-0.10.5 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-transformers-0.5.6.2"

inherit rpm
