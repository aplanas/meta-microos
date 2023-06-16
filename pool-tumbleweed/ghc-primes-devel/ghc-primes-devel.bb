SUMMARY = "Haskell primes library development files"
DESCRIPTION = "This package provides the Haskell primes library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-primes-devel-0.2.1.0-1.2.aarch64.rpm"
RPM_HASH = "50ebef60c21d791c2e3c186beac261c48509e7d4e94324f97f8565251728df66c256b9bfcf7e8ea64559785f97b38c0ee43a80b8b6669ec41ac11b7771ec78bc"

RPROVIDES:${PN} += "ghc-devel-primes-0.2.1.0-EDehUtw1pOPPL7EktYCRg \
ghc-primes-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-primes"

inherit rpm
