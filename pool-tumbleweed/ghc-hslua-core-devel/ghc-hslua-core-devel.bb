SUMMARY = "Haskell hslua-core library development files"
DESCRIPTION = "This package provides the Haskell hslua-core library development files."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-devel-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "784bf5c890d883b8662e79777f3d4423981535d1b5f2bd25ca8b6fd5744809eb7c046bb7f2bfbe29d3878eb10687015be30efb6073d5544cc113350c7d394ec6"

RPROVIDES:${PN} += "ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-hslua-core-devel \
ghc-hslua-core-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(lua-2.3.1-16mGxirchUh4T3oJJYdFzu) \
ghc-devel(mtl-2.2.2) \
ghc-devel(text-2.0.2) \
ghc-hslua-core"

inherit rpm
