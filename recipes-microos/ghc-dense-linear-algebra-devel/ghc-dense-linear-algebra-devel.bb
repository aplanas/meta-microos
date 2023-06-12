SUMMARY = "Haskell dense-linear-algebra library development files"
DESCRIPTION = "This package provides the Haskell dense-linear-algebra library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-devel-0.1.0.0-3.3.aarch64.rpm"
RPM_HASH = "c2677834b6992faa9024dd25dbe547785218d84b92efe2acb15b922beda4364473a36ddb3578403ea2d176881bc286c00ee1644314abd7d8c501c5e61fbc8e26"

RPROVIDES:${PN} += "ghc-dense-linear-algebra-devel \
ghc-dense-linear-algebra-devel(aarch-64) \
ghc-devel(dense-linear-algebra-0.1.0.0-2PBc2PrDutT32RQREBxCzn)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-dense-linear-algebra \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk) \
ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-devel(vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6) \
ghc-devel(vector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8) \
ghc-devel(vector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t)"

inherit rpm
