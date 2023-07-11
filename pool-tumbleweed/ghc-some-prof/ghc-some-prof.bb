SUMMARY = "Haskell some profiling library"
DESCRIPTION = "This package provides the Haskell some profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-prof-1.0.5-1.6.aarch64.rpm"
RPM_HASH = "6e62c4da49cba6fa7714c5e7aa9fd1a769f28e037394843d3d150d0fb91aefe0d6ea8b6a3fa5d98728383842c7f104ec0108dfc2c8e134a31d46c30b059f1bb1"

RPROVIDES:${PN} += "ghc-prof-some-1.0.5-3dwCpkSImpx8T8axxRPR3Z \
ghc-some-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-some-devel"

inherit rpm
