SUMMARY = "Haskell glib library documentation"
DESCRIPTION = "This package provides the Haskell glib library documentation."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-glib-doc-0.13.10.0-1.6.noarch.rpm"
RPM_HASH = "b7bbc8dfdadd27367096426a474d7beaa8ba9d457c0b0b9e2ec269cff15df11f1665cf69056ebbf580716d7f455a7a3638a9a2782b3e31443a341a3da54f5869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-glib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
