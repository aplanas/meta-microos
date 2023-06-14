SUMMARY = "Haskell netlink profiling library"
DESCRIPTION = "This package provides the Haskell netlink profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-prof-1.1.1.0-4.3.aarch64.rpm"
RPM_HASH = "26f1feb796a9fc2b828e9dbd318a9ace8b834a6867e75c8b65ee50239705d219d827d4d62b6ad3b7242ca6fdcab9a746ff5ca5bf47c090d8b9fddc09e357bab0"

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
