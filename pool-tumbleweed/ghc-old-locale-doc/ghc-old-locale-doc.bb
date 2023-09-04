SUMMARY = "Haskell old-locale library documentation"
DESCRIPTION = "This package provides the Haskell old-locale library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-doc-1.0.0.7-13.3.noarch.rpm"
RPM_HASH = "3694fa1eefa0457cf32dc807519b91959e91e047d91f32a34b36e68f397d6b1bda96f5c902aee7afab83276dc0726fba82416d439e9fd61c2ea0c3c348f6b232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-old-locale-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
