SUMMARY = "Haskell torrent profiling library"
DESCRIPTION = "This package provides the Haskell torrent profiling library."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-prof-10000.1.3-1.6.aarch64.rpm"
RPM_HASH = "06e610268fb968a067e97d00eeaec64a11a437da4827598ae125fce718485d13cc469ed989c241515e609a44bef62406e1409c8f02d8f104067080667daf32a3"

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
