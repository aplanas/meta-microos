SUMMARY = "Haskell dlist library documentation"
DESCRIPTION = "This package provides the Haskell dlist library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-doc-1.0-4.1.noarch.rpm"
RPM_HASH = "9a28f26602dd44cb15d5b62c1779a827690529f21a68b1ea3be2ede2d1e145127310368230afc31c10bcb67051eb471fa4d4165e27ef6bdb2354263eaf0e4fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dlist-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
