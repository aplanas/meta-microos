SUMMARY = "Haskell temporary library development files"
DESCRIPTION = "This package provides the Haskell temporary library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-temporary-devel-1.3-6.2.aarch64.rpm"
RPM_HASH = "41282078d3fbefedeea16d7aba4166d902601beaf932e2811e53168a07ae7ea4b168b49e2532e2e54fd403a9551a0f5a698d1d3575aa855ad9117ed581a64282"

RPROVIDES:${PN} += "ghc-devel(temporary-1.3-9rLWZg49Shk3gKExST32p) \
ghc-temporary-devel \
ghc-temporary-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unix-2.7.3) \
ghc-temporary"

inherit rpm
