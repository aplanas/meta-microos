SUMMARY = "Haskell simple-sendfile profiling library"
DESCRIPTION = "This package provides the Haskell simple-sendfile profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.31"

RPM_NAME = "ghc-simple-sendfile-prof-0.2.31-1.1.aarch64.rpm"
RPM_HASH = "cfbc60f8c4113eb3355f73be09b0c744b5852c223dac0d2a151616aa002442223ba2bd3111832ef901d21ca70ec4c0fe342120f8f8e7c57ca6afa7c56c0da43e"

RPROVIDES:${PN} += "ghc-prof(simple-sendfile-0.2.31-701wssQD34oFyvrTLOblUT) \
ghc-simple-sendfile-prof \
ghc-simple-sendfile-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(unix-2.7.3) \
ghc-simple-sendfile-devel"

inherit rpm
