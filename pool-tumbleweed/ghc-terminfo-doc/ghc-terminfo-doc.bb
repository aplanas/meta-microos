SUMMARY = "Haskell terminfo library documentation"
DESCRIPTION = "This package provides the Haskell terminfo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-doc-0.4.1.5-3.2.noarch.rpm"
RPM_HASH = "6489721e83f23ca0233bc731cdf03924330c0a98404ca18628e4f25ecb346fd8cf50c8ab622bebeb24fb6777c64993ff29b92bb3a02dabb30e9702bf2d49f371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-terminfo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
