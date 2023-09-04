SUMMARY = "Haskell primes library development files"
DESCRIPTION = "This package provides the Haskell primes library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-primes-devel-0.2.1.0-1.3.aarch64.rpm"
RPM_HASH = "a8cc21cf0a0d88a8ea734ed9463f6cd57bec40ae112f0cad7f9486d055bdbf256ef86aed60dcbf4a277cb5d386b39645ed51ca84c0b5b13360eb14891827f922"

RPROVIDES:${PN} += "ghc-devel-primes-0.2.1.0-Gyap6mKLPxs4D6ga1tuZTq \
ghc-primes-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-primes"

inherit rpm
