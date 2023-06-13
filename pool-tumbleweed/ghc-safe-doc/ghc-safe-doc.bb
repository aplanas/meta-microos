SUMMARY = "Haskell safe library documentation"
DESCRIPTION = "This package provides the Haskell safe library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-doc-0.3.19-4.3.noarch.rpm"
RPM_HASH = "0d195ebf179f3c8f23f84119699281b0a603d822412888d58555d9a2de9cbae764a4a2886cbe8807ce95c50beb7d9ce0c27f1e4261bce0fae8d7481290113787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-safe-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
