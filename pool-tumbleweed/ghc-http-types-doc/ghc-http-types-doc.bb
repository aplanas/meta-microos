SUMMARY = "Haskell http-types library documentation"
DESCRIPTION = "This package provides the Haskell http-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-doc-0.12.3-6.9.noarch.rpm"
RPM_HASH = "48fe8e2daaae512f1ebbc2c1309c81d6039454243d15b69eac96cc5e02478967922d8baf2c7bb972fd228816ada64cb00d0725a8a9520d39f823086860b9ddd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
