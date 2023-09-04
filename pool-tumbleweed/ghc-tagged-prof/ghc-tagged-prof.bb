SUMMARY = "Haskell tagged profiling library"
DESCRIPTION = "This package provides the Haskell tagged profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.8"

RPM_NAME = "ghc-tagged-prof-0.8.8-1.2.aarch64.rpm"
RPM_HASH = "7e78f1426f15926a6d46215e8418a0831343be1f3eff6c7432608004323a7aa5ebe1d4b4a0d91912691bcbaeaae910c2c03f3777c1c2eee879f68c8f143b1263"

RPROVIDES:${PN} += "ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-tagged-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-tagged-devel"

inherit rpm
