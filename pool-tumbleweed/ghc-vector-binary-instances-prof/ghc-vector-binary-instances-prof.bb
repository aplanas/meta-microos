SUMMARY = "Haskell vector-binary-instances profiling library"
DESCRIPTION = "This package provides the Haskell vector-binary-instances profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-prof-0.2.5.2-6.1.aarch64.rpm"
RPM_HASH = "60d1d3d1c35bc4faa6fb6b77bc37b3d2f5561f7f4635dda06aa23f5c020c1686c8bd415a5f27e80b334b2e67e4c7f05384612cd69602193215b5d4166fb780ed"

RPROVIDES:${PN} += "ghc-prof-vector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8 \
ghc-vector-binary-instances-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-vector-binary-instances-devel"

inherit rpm
