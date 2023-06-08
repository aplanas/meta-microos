SUMMARY = "Haskell Diff library documentation"
DESCRIPTION = "This package provides the Haskell Diff library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-doc-0.4.1-2.3.noarch.rpm"
RPM_HASH = "8db920496446efcab82ea516132c56f814fae669d3230e9f66a8e4de3900696c4c410946329d898ad2f42a9135f487675ed9cf74fe6447f4f08577b8c18a1a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Diff-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
