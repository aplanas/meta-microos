SUMMARY = "Haskell vector-th-unbox profiling library"
DESCRIPTION = "This package provides the Haskell vector-th-unbox profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-vector-th-unbox-prof-0.2.2-4.2.aarch64.rpm"
RPM_HASH = "013c652fde9c9ac4bceadc4d61e946a4352893f2b12964d8f23d748ab4cc6f407c8a534b80da7f6f95032aeed2d726f032e45e281276bd41088967659af7e172"

RPROVIDES:${PN} += "ghc-prof-vector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t \
ghc-vector-th-unbox-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-vector-th-unbox-devel"

inherit rpm
