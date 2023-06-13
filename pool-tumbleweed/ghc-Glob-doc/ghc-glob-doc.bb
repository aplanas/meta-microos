SUMMARY = "Haskell Glob library documentation"
DESCRIPTION = "This package provides the Haskell Glob library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-doc-0.10.2-3.3.noarch.rpm"
RPM_HASH = "071a3ef76ec942f4702aeeab8d6c738553aefe01c919fa2568c71fc75750063bfbad3022314e82123716d5cc60df4e491ecca5b7a6b796992c8e5e48d1cf9c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Glob-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
