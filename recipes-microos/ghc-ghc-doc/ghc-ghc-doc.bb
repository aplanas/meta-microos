SUMMARY = "Haskell ghc library documentation"
DESCRIPTION = "This package provides the Haskell ghc library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-doc-9.4.5-3.1.noarch.rpm"
RPM_HASH = "2d58804771d4d41383839f72774b5588ec770a6064bcbdaacda55157d3a3d372835c3882f6e82ea17a31309cd5da62cce06696d8b16af0acdf7751e651c8e3ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
