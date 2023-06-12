SUMMARY = "Haskell hslua-module-system library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-system library documentation."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-system-doc-1.1.0.1-1.2.noarch.rpm"
RPM_HASH = "0b134a6fa0365b4e629fe50e9b812e69f7d8a524fc72405561e955679c804f1d66883a680c701132a8759fc6a3f0dd6c75b954541ffd74c6d9c7a2673d693488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-system-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
