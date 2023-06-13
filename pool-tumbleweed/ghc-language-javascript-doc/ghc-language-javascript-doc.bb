SUMMARY = "Haskell language-javascript library documentation"
DESCRIPTION = "This package provides the Haskell language-javascript library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-doc-0.7.1.0-4.3.noarch.rpm"
RPM_HASH = "c360cd66190c969d4e31b4a4fcb3036ded681c0fcb44a8b7b780838e86a53993b318e7bbe1f066eb8f8f25405fb95fe9ad008284d767b7817c1b8dbf9b7d07be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-javascript-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
