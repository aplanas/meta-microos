SUMMARY = "Haskell attoparsec-iso8601 library documentation"
DESCRIPTION = "This package provides the Haskell attoparsec-iso8601 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.0"

RPM_NAME = "ghc-attoparsec-iso8601-doc-1.1.0.0-3.1.noarch.rpm"
RPM_HASH = "77760bcd61d9a6becde657448079004ef4b5282112584cc8817501b20cf86d088014e4f9a500f014de0333d6b96eafd4eb17848dd80272d539bf98b168322557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-attoparsec-iso8601-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
