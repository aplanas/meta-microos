SUMMARY = "Haskell language-c library documentation"
DESCRIPTION = "This package provides the Haskell language-c library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-doc-0.9.2-2.3.noarch.rpm"
RPM_HASH = "034af76afb54f45969206ebc7d0a9db317490b80f293dbbb47d1d9ee1a3003af56e7817c824e827169e2ad0f609e3e5e3a5067ca1f09ca088b5b96f4c339670a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-c-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
