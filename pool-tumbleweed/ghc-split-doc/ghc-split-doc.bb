SUMMARY = "Haskell split library documentation"
DESCRIPTION = "This package provides the Haskell split library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-split-doc-0.2.3.5-2.2.noarch.rpm"
RPM_HASH = "5a2b050b69f2b57d683c8f48711981d80a8b279846d7061cf321e0634f4b3a5b37dc57d62641e78c6873adc1e6489bf2a81d886542b2085074858d0c3381b07a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-split-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
