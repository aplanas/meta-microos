SUMMARY = "Haskell pandoc library documentation"
DESCRIPTION = "This package provides the Haskell pandoc library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-doc-3.1.3-1.3.noarch.rpm"
RPM_HASH = "5e59774ebadfacbec2b9e6b8a2f2e98757f2bf3a235973b7a0dec711444f114c973c5fe0d4380e78662d512541159712d7cb7728edfe68672070358f5d5bbb7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
