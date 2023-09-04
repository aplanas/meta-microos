SUMMARY = "Haskell path-pieces library documentation"
DESCRIPTION = "This package provides the Haskell path-pieces library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-doc-0.2.1-12.3.noarch.rpm"
RPM_HASH = "68d50904ab252593bd2810d7c588492c651521d60c405f949defce3702a2667b1568948f5c1f837f765b23f9a68cef07962de0827e80d85b7aaa2ec9f1c075ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-path-pieces-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
