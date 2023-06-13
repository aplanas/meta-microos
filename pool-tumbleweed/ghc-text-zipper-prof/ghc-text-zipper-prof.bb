SUMMARY = "Haskell text-zipper profiling library"
DESCRIPTION = "This package provides the Haskell text-zipper profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "ghc-text-zipper-prof-0.12-2.2.aarch64.rpm"
RPM_HASH = "4b121007a1c21374568bde1967b50476008be80f238478c866441a2a703af8a377fb5617129bf272b831c06799886fdc6c86a571a63e164382079be1ac71077b"

RPROVIDES:${PN} += "ghc-prof(text-zipper-0.12-HAxIdT2NfEj1pbIOe2MIin) \
ghc-text-zipper-prof \
ghc-text-zipper-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(text-2.0.2) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-text-zipper-devel"

inherit rpm
