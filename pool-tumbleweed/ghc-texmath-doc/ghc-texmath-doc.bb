SUMMARY = "Haskell texmath library documentation"
DESCRIPTION = "This package provides the Haskell texmath library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-doc-0.12.8-2.1.noarch.rpm"
RPM_HASH = "c0411073c64f87f132ae738e3a22688aa8c2f57a5b526aec5fb5f8c278d09400c810702eb92982d8fb4530d1c0d050a5a4bce018609ec97996bee2bc87912b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-texmath-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
