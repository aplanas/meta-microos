SUMMARY = "Haskell blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-doc-0.9.1.2-8.3.noarch.rpm"
RPM_HASH = "899f924e5c6af553377c438c70d6937214597814f3cdd61c3be336f0438f45d7fee5568d938c49c7f29122d4cc5cb752dfe0528acf7273527104ca761ffee7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
