SUMMARY = "Haskell texmath profiling library"
DESCRIPTION = "This package provides the Haskell texmath profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-prof-0.12.8-2.1.aarch64.rpm"
RPM_HASH = "be3f9bb051eb1c414e513315ac3663aead36ad9d3d74f7b8ababce77019deb97e3c07858cdd552ca7111347a6ab2b4cc1bab741e38184d75a81e0dabc605801e"

RPROVIDES:${PN} += "ghc-prof-texmath-0.12.8-4XHW2MeUv8XDrGEniW8iCo \
ghc-texmath-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-prof-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-prof-text-2.0.2 \
ghc-prof-typst-symbols-0.1.2-3u6ALqSoiYt5j197EL0vRB \
ghc-prof-xml-1.3.14-JgZFWdUND2BGObIBmJlnFJ \
ghc-texmath-devel"

inherit rpm
