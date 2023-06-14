SUMMARY = "Haskell primes profiling library"
DESCRIPTION = "This package provides the Haskell primes profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-primes-prof-0.2.1.0-1.2.aarch64.rpm"
RPM_HASH = "75b748f0e1b32e552836700aa33af03cce7a435ebf5b3281333c7747f7884874ab6853ab21086ab17db8fb7053f4b66ba49854956b7c14467515a401137b5fec"

RPROVIDES:${PN} += "ghc-primes-prof \
ghc-prof-primes-0.2.1.0-EDehUtw1pOPPL7EktYCRg"

RDEPENDS:${PN} += "ghc-primes-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
