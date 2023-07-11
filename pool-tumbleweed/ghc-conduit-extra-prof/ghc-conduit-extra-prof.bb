SUMMARY = "Haskell conduit-extra profiling library"
DESCRIPTION = "This package provides the Haskell conduit-extra profiling library."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "ghc-conduit-extra-prof-1.3.6-2.8.aarch64.rpm"
RPM_HASH = "a6be7de35959812f22d3650d4b2a7c8c09deaad83b83e09d8eb351d5b19a1aa2b1e53ea321e4f4d7ac901edb499cd52f1313afa90731c8243cb55d0930ae5d08"

RPROVIDES:${PN} += "ghc-conduit-extra-prof \
ghc-prof-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2"

RDEPENDS:${PN} += "ghc-conduit-extra-devel \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-process-1.6.16.0 \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-stm-2.5.1.0 \
ghc-prof-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-typed-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO \
ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj"

inherit rpm
