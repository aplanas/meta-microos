SUMMARY = "Haskell skylighting-format-blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-doc-0.1.1-2.6.noarch.rpm"
RPM_HASH = "e8c4fda95140ac88fc5d94e32a72dd326b442ddd3e08516ed4921fab7a246004ecd4f08c7d488e0ea783b0c79a7253e958c52286293b9c97be67b3d823058133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
