SUMMARY = "Haskell directory library documentation"
DESCRIPTION = "This package provides the Haskell directory library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-doc-1.3.7.1-1.1.noarch.rpm"
RPM_HASH = "62db4deab20e37acd3f56af6403964589b077769b80f82d09a28f8eeee1bf84a839547d5eab9a60ceece63e9bf456378fbb4d427104c1b2ae9b04248c266cf18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-directory-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
