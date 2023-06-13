SUMMARY = "Haskell hashtables profiling library"
DESCRIPTION = "This package provides the Haskell hashtables profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-prof-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "543c65f58831ee699b117eb20e7fb7e54796232817f3d0a78f4ff0f1be7216bf7c086a79db5444484e99e49941c23e82bf70e6d54b6c67150f1d649df940831b"

RPROVIDES:${PN} += "ghc-hashtables-prof \
ghc-hashtables-prof(aarch-64) \
ghc-prof(hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p)"

RDEPENDS:${PN} += "ghc-hashtables-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
