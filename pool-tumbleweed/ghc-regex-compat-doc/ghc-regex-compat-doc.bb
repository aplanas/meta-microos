SUMMARY = "Haskell regex-compat library documentation"
DESCRIPTION = "This package provides the Haskell regex-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.1"

RPM_NAME = "ghc-regex-compat-doc-0.95.2.1-4.2.noarch.rpm"
RPM_HASH = "f21eba221d58736f5ddba5d89877a826d2d6e269f95e3d3fa59f3408e3d3f3d54fb2ca0d06c56e22153c7ce897fc69d78101f1be86fd36a2bfd093f360bc0778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
