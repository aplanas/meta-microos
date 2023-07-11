SUMMARY = "Haskell commonmark library documentation"
DESCRIPTION = "This package provides the Haskell commonmark library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-commonmark-doc-0.2.3-1.2.noarch.rpm"
RPM_HASH = "e8231396038c7606396b60c7b71bf0baf110ebd33917f335b1b98f872959706a5cc7e18c8a2501f29f16eea898f90e4d109454e6cc017e95e0883b5c975a4315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
