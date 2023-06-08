SUMMARY = "Haskell base library documentation"
DESCRIPTION = "This package provides the Haskell base library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-doc-4.17.1.0-1.1.noarch.rpm"
RPM_HASH = "fa688c83c5857866f8f89e5b8a769ae527eacc9c8463f3129164fe6db9ba089bac7793dd7b49ded3b5c59552f8b7629f0a42d312c13266979c230f521ed30b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
