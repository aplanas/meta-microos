SUMMARY = "Haskell libiserv library development files"
DESCRIPTION = "This package provides the Haskell libiserv library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-libiserv-devel-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "851788506e9c78ad9b2c40d9c0003c0ed5da79803e3e2a57d5b2b465fe06c4766d56ef29c1996b8c83a3d415eeaa3e7d8c99e0f418ed634fe3f6a1bfdd1ff601"

RPROVIDES:${PN} += "ghc-devel-libiserv-9.4.5 \
ghc-libiserv-devel \
ghc-libiserv-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghci-9.4.5 \
ghc-devel-unix-2.7.3 \
ghc-libiserv"

inherit rpm
