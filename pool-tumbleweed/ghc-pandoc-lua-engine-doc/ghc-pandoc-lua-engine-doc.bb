SUMMARY = "Haskell pandoc-lua-engine library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-doc-0.2.0.1-1.7.noarch.rpm"
RPM_HASH = "a2f0e9da04729534547bc8183957b8d7e5f08eb12664b4964e56ddfbe9c267bd60da1c0989df2d142da469470d1af0de37c705d0a8e1f579e9e451e0132b2040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
