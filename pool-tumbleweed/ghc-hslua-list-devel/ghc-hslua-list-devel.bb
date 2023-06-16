SUMMARY = "Haskell hslua-list library development files"
DESCRIPTION = "This package provides the Haskell hslua-list library development files."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-devel-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "0852ab1cc2551e49e384f5dc053017b298c190b691189b7924832faec94cea239655c7be3aa62059091efa0011d68582649ba71f06e322ea7c4ce887da6483aa"

RPROVIDES:${PN} += "ghc-devel-hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A \
ghc-hslua-list-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-hslua-list"

inherit rpm
