SUMMARY = "Haskell vty library documentation"
DESCRIPTION = "This package provides the Haskell vty library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-doc-5.38-2.11.noarch.rpm"
RPM_HASH = "3dd3d3c459b2943cf50678ef37ac938ed4a9a0dd2710ba18fd68789fd52f177b84f93fe1c527f78382686ac482fc91b185d6757413ac7ec687104bb02d980061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
