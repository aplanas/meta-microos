SUMMARY = "Haskell hjsmin library documentation"
DESCRIPTION = "This package provides the Haskell hjsmin library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-doc-0.2.1-1.8.noarch.rpm"
RPM_HASH = "3912fbef8c984dd31fa72b94b479ac047ff3dc03b46430b5df15fda811738d1627be197fcbc265c15569b7ecfd93e93ed7a090c4bf394e44b0d3ad209dd13911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hjsmin-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
