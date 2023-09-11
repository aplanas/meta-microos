SUMMARY = "Haskell texmath profiling library"
DESCRIPTION = "This package provides the Haskell texmath profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8.1"

RPM_NAME = "ghc-texmath-prof-0.12.8.1-1.1.aarch64.rpm"
RPM_HASH = "cd58140631714f5455fe7d98196db8db31949df602eff62557029bafeb4ec9fa98fbd48c2d2f97602caa5fd22f2c2e4834f91412e23a8c40f2612f31d6e3edc6"

RPROVIDES:${PN} += "ghc-prof-texmath-0.12.8.1-3LxXxmLvAtyApeIh6UJCwI \
ghc-texmath-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-prof-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-prof-text-2.0.2 \
ghc-prof-typst-symbols-0.1.4-JaoP2leChnCACsgYhrK1kO \
ghc-prof-xml-1.3.14-JgZFWdUND2BGObIBmJlnFJ \
ghc-texmath-devel"

inherit rpm
