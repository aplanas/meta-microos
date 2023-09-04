SUMMARY = "Haskell html library documentation"
DESCRIPTION = "This package provides the Haskell html library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-doc-1.0.1.2-4.3.noarch.rpm"
RPM_HASH = "ab788d8201fda078d3a587ee94b86f7a0dff935bf0c6dc886c8ff0c9b00c98930f7b06772efc1bc2379f58568d8fe9676fbc6e3678cf7d67b15017a0f89d6c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
