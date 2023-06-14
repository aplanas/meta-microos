SUMMARY = "Haskell dense-linear-algebra profiling library"
DESCRIPTION = "This package provides the Haskell dense-linear-algebra profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-prof-0.1.0.0-3.3.aarch64.rpm"
RPM_HASH = "78df6b64e12234435996a33311d302bb64dad71d80585bb6b58d3d2128846eacd856c866322039d9c872f557c4aedead99e98f3746b3862446736ec7074fbd77"

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
