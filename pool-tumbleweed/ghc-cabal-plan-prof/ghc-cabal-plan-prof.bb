SUMMARY = "Haskell cabal-plan profiling library"
DESCRIPTION = "This package provides the Haskell cabal-plan profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "ghc-cabal-plan-prof-0.7.3.0-2.4.aarch64.rpm"
RPM_HASH = "429056384964cde83fd06e1f33d1ec9733adba84f6fb8fc6e10c18f5f8bb0340789b4ddc454c9b498fd1945e374189d3e6a2ca4dc2b4b5a7d61eeb330b9214d3"

RPROVIDES:${PN} += "ghc-cabal-plan-prof \
ghc-prof-cabal-plan-0.7.3.0-JgI03Zk58SqF3DU0HK7M4b"

RDEPENDS:${PN} += "ghc-cabal-plan-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
