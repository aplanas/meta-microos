SUMMARY = "Haskell ghc-heap library development files"
DESCRIPTION = "This package provides the Haskell ghc-heap library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-devel-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "f4be83c803bfee30de730dfb6953351802e4727a1a5fc2e2f97f0514845685c244a3839725edc6930aff28dd1b43c17bbb145d316b346056aec8a83b4400c8a0"

RPROVIDES:${PN} += "ghc-devel(ghc-heap-9.4.5) \
ghc-ghc-heap-devel \
ghc-ghc-heap-devel(aarch-64) \
ghc-ghc-heap-static \
ghc-ghc-heap-static(aarch-64)"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(rts-1.0.2) \
ghc-ghc-heap(aarch-64)"

inherit rpm
