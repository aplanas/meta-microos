SUMMARY = "Haskell sop-core library documentation"
DESCRIPTION = "This package provides the Haskell sop-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-doc-0.5.0.2-4.3.noarch.rpm"
RPM_HASH = "673424b36dbf6c88dcd08fa213ac9b2b8bebe27f2b22c34097146f113cba2426e74140fc76ebe8b6ccafd2070b906252e4947b01be57607ab8614178b36bee55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-sop-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
