SUMMARY = "Haskell safe-exceptions library documentation"
DESCRIPTION = "This package provides the Haskell safe-exceptions library documentation."
LICENSE = "MIT"

PV = "0.1.7.3"

RPM_NAME = "ghc-safe-exceptions-doc-0.1.7.3-2.2.noarch.rpm"
RPM_HASH = "3ab45b06ee7d18906cfb8ca88277d273f8eb9b185ba541f42b4feb7f5e41a90db06c2c502208eacfc17464c4dae3144dbdec6ddb8ba2398d2e4a12b21ec48e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-safe-exceptions-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
