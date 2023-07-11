SUMMARY = "Haskell lens library documentation"
DESCRIPTION = "This package provides the Haskell lens library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.2.2"

RPM_NAME = "ghc-lens-doc-5.2.2-1.6.noarch.rpm"
RPM_HASH = "752896bbf81adc883134ea8d38aceac6fc63f222df7b81095bc042893d48f038403d24787da7090caed7f5ddf6929907a56f0dd0c259f41cada65a22923f62fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lens-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
