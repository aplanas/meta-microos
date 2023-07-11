SUMMARY = "Haskell safe-exceptions profiling library"
DESCRIPTION = "This package provides the Haskell safe-exceptions profiling library."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-prof-0.1.7.4-1.1.aarch64.rpm"
RPM_HASH = "ef18557349ba988046d00b6fefbfcff0c592108ac09d51fd49d432cf1ed887486d0b17867793611fb7d73d7ed2bf921e135a7da48045728d3b2ab750e70143e0"

RPROVIDES:${PN} += "ghc-prof-safe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb \
ghc-safe-exceptions-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-transformers-0.5.6.2 \
ghc-safe-exceptions-devel"

inherit rpm
