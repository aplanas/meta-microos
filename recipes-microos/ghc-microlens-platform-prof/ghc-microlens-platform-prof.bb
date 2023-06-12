SUMMARY = "Haskell microlens-platform profiling library"
DESCRIPTION = "This package provides the Haskell microlens-platform profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-prof-0.4.3.3-2.3.aarch64.rpm"
RPM_HASH = "55c6b53faff3ba1c8ee986f7edcf859afdf55fe0096315cfe81bb39db680a629735ea158cfeba10cb70e18c4239428b6c4a2822ff2e152037de2ef6df5d716cb"

RPROVIDES:${PN} += "ghc-microlens-platform-prof \
ghc-microlens-platform-prof(aarch-64) \
ghc-prof(microlens-platform-0.4.3.3-9nLg9j7jRAiHEY5VUSmG6h)"
RDEPENDS:${PN} += "ghc-microlens-platform-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1) \
ghc-prof(microlens-ghc-0.4.14.1-4Q8SZXKkgj872LFERorIGB) \
ghc-prof(microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV) \
ghc-prof(microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG) \
ghc-prof(text-2.0.2) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
