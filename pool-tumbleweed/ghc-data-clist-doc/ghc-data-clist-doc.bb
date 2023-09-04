SUMMARY = "Haskell data-clist library documentation"
DESCRIPTION = "This package provides the Haskell data-clist library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-doc-0.2-2.3.noarch.rpm"
RPM_HASH = "540b51e26d7738eb2e0e8cea23448acc274c48d98facd7d212f2558bfbec1a41237b7839a56b2be94a71b8bc364dbec633014f7dd335aa0eae35e45121f78150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-clist-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
