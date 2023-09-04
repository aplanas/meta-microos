SUMMARY = "Haskell netlink profiling library"
DESCRIPTION = "This package provides the Haskell netlink profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-prof-1.1.1.0-4.8.aarch64.rpm"
RPM_HASH = "52d6496773cdb1d65731d51fa03e92ee07d940f153ad57a3fde5748929d66e7a401d032a9976b4dae2e38c1ee2075e18bf15928f8cbbacf1c9a0ca419b15e42c"

RPROVIDES:${PN} += "ghc-netlink-prof \
ghc-prof-netlink-1.1.1.0-AkYwYtaCv1eG7Xks1z5IhU"

RDEPENDS:${PN} += "ghc-netlink-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-prof-containers-0.6.7 \
ghc-prof-monad-loops-0.4.3-Hqvq9oJQAvl8Gm82ocTn8i \
ghc-prof-pretty-hex-1.1-6nqTsc1Xx7vJSzZ0xX5VyC \
ghc-prof-unix-2.7.3"

inherit rpm
