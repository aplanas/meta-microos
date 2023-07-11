SUMMARY = "Haskell deepseq library documentation"
DESCRIPTION = "This package provides the Haskell deepseq library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-doc-1.4.8.0-3.2.noarch.rpm"
RPM_HASH = "f5e5f54132eb10e49fc7af4fbf95a0c8165fe64c7273c8cb01193dd9a8c9607a020f7d85da79963e25bbd467cdb7d5799e85f43cb13fa1f869d5875671fc8d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-deepseq-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
