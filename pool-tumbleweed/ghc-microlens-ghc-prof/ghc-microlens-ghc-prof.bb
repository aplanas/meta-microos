SUMMARY = "Haskell microlens-ghc profiling library"
DESCRIPTION = "This package provides the Haskell microlens-ghc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.14.1"

RPM_NAME = "ghc-microlens-ghc-prof-0.4.14.1-2.3.aarch64.rpm"
RPM_HASH = "7159492b394d55c1861c2e37be5edfebd1b5b3ce252368fb9e3e40c4cd97f316c5be72c430c58b42138bc0f230d716aa8bde60779c85247a776c67e4db2fef68"

RPROVIDES:${PN} += "ghc-microlens-ghc-prof \
ghc-prof-microlens-ghc-0.4.14.1-JKvcbzfcB6d2jcW7Wili89"

RDEPENDS:${PN} += "ghc-microlens-ghc-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
