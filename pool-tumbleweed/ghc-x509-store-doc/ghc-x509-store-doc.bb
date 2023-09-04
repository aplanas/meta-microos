SUMMARY = "Haskell x509-store library documentation"
DESCRIPTION = "This package provides the Haskell x509-store library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-doc-1.6.9-2.8.noarch.rpm"
RPM_HASH = "16a43025739940c7e2b4c03faec02fde716b9ed2f9ca2bba525df4556b84e488219e25554056d7fee4e2197c4a1b11c7b5fb5a0a40a8d2224e64fd3026b93f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-store-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
