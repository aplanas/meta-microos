SUMMARY = "Haskell pandoc-types library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-types library documentation."
LICENSE = "GPL-2.0-only"

PV = "1.23"

RPM_NAME = "ghc-pandoc-types-doc-1.23-1.3.noarch.rpm"
RPM_HASH = "643b19542e4a68ca715435b44aae8a2af03a95ba74979ca924b914f2dac8701ff7377335ec051eb4eeb918d2460974a1f303fe9aa7bc9c211899757fdea09e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-types-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
