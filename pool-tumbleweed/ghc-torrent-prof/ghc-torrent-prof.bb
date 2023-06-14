SUMMARY = "Haskell torrent profiling library"
DESCRIPTION = "This package provides the Haskell torrent profiling library."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-prof-10000.1.3-1.3.aarch64.rpm"
RPM_HASH = "22c1b8efcdda2e679ed21970da47ac41cd069e958180bbf743a5918f90184561939569dfbf51737181f065509b82d76958e74428cc29420172b65da50874a60b"

RPROVIDES:${PN} += "ghc-prof-torrent-10000.1.3-6s7CFs4CbkZ3Yp9HO0y2ZH \
ghc-torrent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bencode-0.6.1.1-GM7FbH3LNxfAWaUPR0lH5w \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-torrent-devel"

inherit rpm
