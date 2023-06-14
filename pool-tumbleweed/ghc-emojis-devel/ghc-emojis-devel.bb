SUMMARY = "Haskell emojis library development files"
DESCRIPTION = "This package provides the Haskell emojis library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-emojis-devel-0.1.2-2.2.aarch64.rpm"
RPM_HASH = "27e6a6dcafeda31088240c8b8eba95519f5e0220b7ae7f077b439d9ab3e0ad2858620334a638720196e2ab75429076a8541b62dee8b117233e930d210b773997"

RPROVIDES:${PN} += "ghc-devel-emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm \
ghc-emojis-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-emojis"

inherit rpm
