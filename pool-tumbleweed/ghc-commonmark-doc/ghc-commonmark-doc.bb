SUMMARY = "Haskell commonmark library documentation"
DESCRIPTION = "This package provides the Haskell commonmark library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-commonmark-doc-0.2.3-1.4.noarch.rpm"
RPM_HASH = "2456dafb6e4df7455e6831beafa7f86c1b5bdef48b1aa5ea3624a8cf15e0816469ccba9cd8015b032ec10db4a2bee8e18c04f27ba743ed4e328bf4ecff3f206c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
