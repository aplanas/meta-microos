SUMMARY = "Haskell torrent library development files"
DESCRIPTION = "This package provides the Haskell torrent library development files."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-devel-10000.1.3-1.6.aarch64.rpm"
RPM_HASH = "af7c8b95ffe827a485bd02e8272b92cef8dc710db1f4eaf5685ebe7c305f40dfa14ceb835e889372ba4808eff3edc99418cf05e4ff5f452487fbbd37c64c3e80"

RPROVIDES:${PN} += "ghc-devel-torrent-10000.1.3-6s7CFs4CbkZ3Yp9HO0y2ZH \
ghc-torrent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bencode-0.6.1.1-GM7FbH3LNxfAWaUPR0lH5w \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-torrent"

inherit rpm
