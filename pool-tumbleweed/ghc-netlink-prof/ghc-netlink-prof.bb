SUMMARY = "Haskell netlink profiling library"
DESCRIPTION = "This package provides the Haskell netlink profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-prof-1.1.1.0-4.6.aarch64.rpm"
RPM_HASH = "b459ab22754007ec9049861131c64fa2a2310552693229bbafa4198b6aebd4e3224e58d8e68c77b1efa990a43be701908afdb8462e2a2b5161f82b8370a5add7"

RPROVIDES:${PN} += "ghc-netlink-prof \
ghc-prof-netlink-1.1.1.0-3cQkQWnXFQnLtl9CehLMU3"

RDEPENDS:${PN} += "ghc-netlink-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-containers-0.6.7 \
ghc-prof-monad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9 \
ghc-prof-pretty-hex-1.1-2861Nkv8pS0CIRpZJwwJMG \
ghc-prof-unix-2.7.3"

inherit rpm
