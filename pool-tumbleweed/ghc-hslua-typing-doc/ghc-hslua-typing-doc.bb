SUMMARY = "Haskell hslua-typing library documentation"
DESCRIPTION = "This package provides the Haskell hslua-typing library documentation."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "ghc-hslua-typing-doc-0.1.0-1.3.noarch.rpm"
RPM_HASH = "5f8b7e1fc279e96d85bf5108a78a24c26f7c7c605d971661b4fa0517a99b7f9b9faf928acb8e7ed1d59a86c7ce9ae8034947799693552f584742a6e11fd35cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-typing-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
