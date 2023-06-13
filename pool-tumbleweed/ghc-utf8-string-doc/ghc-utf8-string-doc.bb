SUMMARY = "Haskell utf8-string library documentation"
DESCRIPTION = "This package provides the Haskell utf8-string library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-doc-1.0.2-2.3.noarch.rpm"
RPM_HASH = "3f1cd9a8288a435e578811f18411c12ffbd8e592234e07c72a6470c2902c1c4620fff065077619ee73aa1644c814389f95ebc9089d24ee7a6abf2c315390f966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-utf8-string-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
