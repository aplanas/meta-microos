SUMMARY = "Haskell typst-symbols library development files"
DESCRIPTION = "This package provides the Haskell typst-symbols library development files."
LICENSE = "MIT"

PV = "0.1.0.1"

RPM_NAME = "ghc-typst-symbols-devel-0.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "3f6294afbdbf496425e64070d5550b5574f105de550a262b1792948fe10b188b05d4403c1e21d813f3b14ad53b810395f445ccc3996246ec3c3486b7e99725c0"

RPROVIDES:${PN} += "ghc-devel-typst-symbols-0.1.0.1-68asM8ctSWGeebFauBl8u \
ghc-typst-symbols-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-text-2.0.2 \
ghc-typst-symbols"

inherit rpm
