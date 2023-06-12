SUMMARY = "Haskell skylighting-format-blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-doc-0.1.1-2.3.noarch.rpm"
RPM_HASH = "4bad915eed4557c9a5add54e20ed4dea71333e35bd5120e1b064fb58bd618cdb92398c768eac40726376a8ee31e51d0ef975fd7511a9572716a40f0c94267cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-blaze-html-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
