SUMMARY = "Haskell statistics library documentation"
DESCRIPTION = "This package provides the Haskell statistics library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.16.2.0"

RPM_NAME = "ghc-statistics-doc-0.16.2.0-1.6.noarch.rpm"
RPM_HASH = "5f4bd5d301fbcfe80b6ba240d9b5c35fd11e61efe06b5e2d84a8bfefc73941c8deff6f2cb0e9d640377f7fabf7b5b2d6ea211add0b73d2e5dabb6c2e01d31e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-statistics-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
