SUMMARY = "Haskell blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-prof-0.9.1.2-10.1.aarch64.rpm"
RPM_HASH = "098a166548dac941608643ffb3d1434074c2090876d5d9a3bf94d9e9b5106e864ccfd6cdc1d1dc7bc3d339e0117f3f4e0f2e65555d7f029d65e9ba259dc8b360"

RPROVIDES:${PN} += "ghc-blaze-html-prof \
ghc-prof-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii"

RDEPENDS:${PN} += "ghc-blaze-html-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-prof-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2"

inherit rpm
