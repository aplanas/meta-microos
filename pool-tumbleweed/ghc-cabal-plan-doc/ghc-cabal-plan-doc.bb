SUMMARY = "Haskell cabal-plan library documentation"
DESCRIPTION = "This package provides the Haskell cabal-plan library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "ghc-cabal-plan-doc-0.7.3.0-1.2.noarch.rpm"
RPM_HASH = "dbb47f751260ed8a829b3fc8b312ff513403e15385f94be364e5b237309ee62ed013340becf8e3ff94447f73c985e38046d60d4e103ecc0b8269fc47202eb958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-plan-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
