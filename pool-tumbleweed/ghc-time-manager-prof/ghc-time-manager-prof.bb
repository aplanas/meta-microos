SUMMARY = "Haskell time-manager profiling library"
DESCRIPTION = "This package provides the Haskell time-manager profiling library."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "ghc-time-manager-prof-0.0.1-1.1.aarch64.rpm"
RPM_HASH = "110f6bb3c16b7d62c9dc894fe0cf3a1c6596af0ecca91e668f3dd0502f4936bb8bef35f003e13ca2497824d9cac3dc8cc9717b5c56f1cd8dabcb409016f7d83b"

RPROVIDES:${PN} += "ghc-prof-time-manager-0.0.1-8jNNuzTBrN1AP9vZ7ZYdJS \
ghc-time-manager-prof"

RDEPENDS:${PN} += "ghc-prof-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-prof-base-4.17.2.0 \
ghc-prof-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-time-manager-devel"

inherit rpm
