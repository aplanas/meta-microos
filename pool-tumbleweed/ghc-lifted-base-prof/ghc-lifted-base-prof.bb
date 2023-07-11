SUMMARY = "Haskell lifted-base profiling library"
DESCRIPTION = "This package provides the Haskell lifted-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-prof-0.2.3.12-8.6.aarch64.rpm"
RPM_HASH = "cff8a96617d2c3fd1fb4c36309d19f0b462c4a1eb3f3c17168712fcd85e6fcffacb3268022a0af98046f3ac7186f8e09ec6a4429a23f8dfd40c420ac7727ace9"

RPROVIDES:${PN} += "ghc-lifted-base-prof \
ghc-prof-lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo"

RDEPENDS:${PN} += "ghc-lifted-base-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-prof-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp"

inherit rpm
