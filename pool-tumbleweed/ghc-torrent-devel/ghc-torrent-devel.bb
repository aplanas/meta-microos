SUMMARY = "Haskell torrent library development files"
DESCRIPTION = "This package provides the Haskell torrent library development files."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-devel-10000.1.3-1.3.aarch64.rpm"
RPM_HASH = "1333483b02075eb2b86c0fcba21608cf36525cdd4e81c54e0a8c9e825bae1f0e20ccb11d1c7b16cfa2c294d7070fcb3f39bf653f6188394a9148c8b29c3f48b3"

RPROVIDES:${PN} += "ghc-devel(torrent-10000.1.3-6s7CFs4CbkZ3Yp9HO0y2ZH) \
ghc-torrent-devel \
ghc-torrent-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bencode-0.6.1.1-GM7FbH3LNxfAWaUPR0lH5w) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i) \
ghc-torrent"

inherit rpm
