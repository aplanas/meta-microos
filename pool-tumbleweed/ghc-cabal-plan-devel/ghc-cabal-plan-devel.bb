SUMMARY = "Haskell cabal-plan library development files"
DESCRIPTION = "This package provides the Haskell cabal-plan library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "ghc-cabal-plan-devel-0.7.3.0-2.4.aarch64.rpm"
RPM_HASH = "46165843544ead64e4ac48a4231c41b66e8618409b656b1dab71c5639112f1a45d12c19326cf7216e4ea874cfdbfd71a82ee2255dff441431c2e35768d0bd6fc"

RPROVIDES:${PN} += "ghc-cabal-plan-devel \
ghc-devel-cabal-plan-0.7.3.0-JgI03Zk58SqF3DU0HK7M4b"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-plan \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-text-2.0.2"

inherit rpm
