SUMMARY = "Haskell dense-linear-algebra profiling library"
DESCRIPTION = "This package provides the Haskell dense-linear-algebra profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-prof-0.1.0.0-3.6.aarch64.rpm"
RPM_HASH = "6be6d0e1f96828fbc3028640358b36a1bdcf08c791c7709c871e48cc6fa4dac7cfff7342141ac39b10794899a0759b6191686195c9b0a28f756f320e9e613df8"

RPROVIDES:${PN} += "ghc-dense-linear-algebra-prof \
ghc-prof-dense-linear-algebra-0.1.0.0-2PBc2PrDutT32RQREBxCzn"

RDEPENDS:${PN} += "ghc-dense-linear-algebra-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6 \
ghc-prof-vector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8 \
ghc-prof-vector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t"

inherit rpm
