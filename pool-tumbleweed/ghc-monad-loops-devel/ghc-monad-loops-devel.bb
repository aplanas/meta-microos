SUMMARY = "Haskell monad-loops library development files"
DESCRIPTION = "This package provides the Haskell monad-loops library development files."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-devel-0.4.3-11.3.aarch64.rpm"
RPM_HASH = "20be79d620ed299f653dda6667a3c638734f93d9f8d30f68c35a1826ac34a77da3909d827b49d2ad51226056534dabb65f95137d0b06445934a19e9f76f833bc"

RPROVIDES:${PN} += "ghc-devel-monad-loops-0.4.3-Hqvq9oJQAvl8Gm82ocTn8i \
ghc-monad-loops-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-monad-loops"

inherit rpm
