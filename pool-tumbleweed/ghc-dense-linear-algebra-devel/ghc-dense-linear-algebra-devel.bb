SUMMARY = "Haskell dense-linear-algebra library development files"
DESCRIPTION = "This package provides the Haskell dense-linear-algebra library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-devel-0.1.0.0-3.6.aarch64.rpm"
RPM_HASH = "c28238cda43db6c91977f2e3293b2a1edfc7eced6c2edbc3de20cf96f2784b31a858e96e8e2f3c93f4e7736b3f429062cabbd05cb32da33d30223a1809e2298f"

RPROVIDES:${PN} += "ghc-dense-linear-algebra-devel \
ghc-devel-dense-linear-algebra-0.1.0.0-2PBc2PrDutT32RQREBxCzn"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-dense-linear-algebra \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6 \
ghc-devel-vector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8 \
ghc-devel-vector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t"

inherit rpm
