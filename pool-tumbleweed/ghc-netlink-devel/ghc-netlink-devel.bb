SUMMARY = "Haskell netlink library development files"
DESCRIPTION = "This package provides the Haskell netlink library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-devel-1.1.1.0-4.6.aarch64.rpm"
RPM_HASH = "01a4e349580dcc98c1a870b0abcc97a44c47f7310d9c81518c282cd738c35210590805ecf7304f26ff0e5936d8d494dc70ca37148888d6827eb40c58300966db"

RPROVIDES:${PN} += "ghc-devel-netlink-1.1.1.0-3cQkQWnXFQnLtl9CehLMU3 \
ghc-netlink-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-containers-0.6.7 \
ghc-devel-monad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9 \
ghc-devel-pretty-hex-1.1-2861Nkv8pS0CIRpZJwwJMG \
ghc-devel-unix-2.7.3 \
ghc-netlink"

inherit rpm
