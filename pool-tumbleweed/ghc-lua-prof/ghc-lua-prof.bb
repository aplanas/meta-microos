SUMMARY = "Haskell lua profiling library"
DESCRIPTION = "This package provides the Haskell lua profiling library."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-prof-2.3.1-1.8.aarch64.rpm"
RPM_HASH = "a2bd4c8a19c9bebd16d33481cfc19a8453bde5752bbdb2b0888def6a38d3325eca1e5fff4154531b1abb93071c29d12cbf812eb23c1b25fba62d70d21bff584c"

RPROVIDES:${PN} += "ghc-lua-prof \
ghc-prof-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h"

RDEPENDS:${PN} += "ghc-lua-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
