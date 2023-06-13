SUMMARY = "Haskell isocline library documentation"
DESCRIPTION = "This package provides the Haskell isocline library documentation."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-doc-1.0.9-1.3.noarch.rpm"
RPM_HASH = "1a70062f2dc7116251f881098902085b43c8e577822cd4f6a5d5f1b0fe1f4180963a0b7f7004a831d4c10bb34612393ded8d669bf3f8e855730a94cfc0a992f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-isocline-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
