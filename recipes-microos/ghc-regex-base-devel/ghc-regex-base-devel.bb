SUMMARY = "Haskell regex-base library development files"
DESCRIPTION = "This package provides the Haskell regex-base library development files."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-devel-0.94.0.2-3.3.aarch64.rpm"
RPM_HASH = "bae8d2aaac525900626147b7412313f1810a5c90d3751262f795e287d80a40c700ef30ff38bc3b9b1bebf5e0c4e3244a9ae12d7a19d168fa84fa772f30211d1e"

RPROVIDES:${PN} += "ghc-devel(regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq) \
ghc-regex-base-devel \
ghc-regex-base-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(text-2.0.2) \
ghc-regex-base"

inherit rpm
