SUMMARY = "Haskell texmath library development files"
DESCRIPTION = "This package provides the Haskell texmath library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-devel-0.12.8-2.1.aarch64.rpm"
RPM_HASH = "64bd02d3f197b2e73b932c44096327f15c31713b03823561aa4586d691f848b5305855c3906c6829dc447d391cfce092d8ed8895c0af562f5b5f1bb38268e554"

RPROVIDES:${PN} += "ghc-devel-texmath-0.12.8-4XHW2MeUv8XDrGEniW8iCo \
ghc-texmath-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-devel-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-devel-text-2.0.2 \
ghc-devel-typst-symbols-0.1.2-3u6ALqSoiYt5j197EL0vRB \
ghc-devel-xml-1.3.14-JgZFWdUND2BGObIBmJlnFJ \
ghc-texmath"

inherit rpm
