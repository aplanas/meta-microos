SUMMARY = "Haskell hslua-module-version library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-version library documentation."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-version-doc-1.1.0-1.2.noarch.rpm"
RPM_HASH = "738d52cdabf1ac707d9540b351f6ea97696c7a61d938a88e75c10e7bdf5a6868fe6dc1f47e71778b93cc60c613435bb70ae6f325db799d1dfac2bafaf35db3f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-version-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
