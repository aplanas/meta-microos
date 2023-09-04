SUMMARY = "Haskell skylighting-format-blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-doc-0.1.1-2.10.noarch.rpm"
RPM_HASH = "b9fcf34b52146a1d3bed1943fae7e0573b878ab9369cb7b5d1a21feb8c5df2b98c9db1f7dd3a61ae5407ffaabc2066fdc674be09024f954b705e6e7d85f13142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
