SUMMARY = "Haskell xmobar library documentation"
DESCRIPTION = "This package provides the Haskell xmobar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "ghc-xmobar-doc-0.46-2.11.noarch.rpm"
RPM_HASH = "33ee6749d7f00f5eb753e5038480dce3a5f9a5526fb180bc80789e37f3128d766ea895b304269b9128e4cb8312ccd71c55c8659fef97a88092933fea8b6a90f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmobar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
