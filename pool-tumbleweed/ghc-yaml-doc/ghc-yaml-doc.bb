SUMMARY = "Haskell yaml library documentation"
DESCRIPTION = "This package provides the Haskell yaml library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.0"

RPM_NAME = "ghc-yaml-doc-0.11.11.0-1.3.noarch.rpm"
RPM_HASH = "7e634b0be423aab2780253fe87927a2aecd38efcdfa45299ab1d81fb1b6b5292b853c632921a6ab13bb63451bc4f34d8f196bf2c113116c2cb2d7299c0d5d4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yaml-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
