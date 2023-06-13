SUMMARY = "Haskell hackage-security library documentation"
DESCRIPTION = "This package provides the Haskell hackage-security library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-doc-0.6.2.3-1.3.noarch.rpm"
RPM_HASH = "701d069f4f5e14260fe8ad790a98a515ddf77d989c32a2443ec6ba4dee833898010ce36824bbecdf82f15078fa5b6c802eee566b738cdbadb00d9e2b29fda345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hackage-security-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
