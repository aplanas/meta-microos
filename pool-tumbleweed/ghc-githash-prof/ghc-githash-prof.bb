SUMMARY = "Haskell githash profiling library"
DESCRIPTION = "This package provides the Haskell githash profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-prof-0.1.7.0-1.3.aarch64.rpm"
RPM_HASH = "46cdeed952e24f1bf111cd24d8e78e58457925c8039fe8d709365ed7617f6b234075d843d7327c9373964a5af316b92ff6252301b68ee880ced7a3fc0a6cfa33"

RPROVIDES:${PN} += "ghc-githash-prof \
ghc-prof-githash-0.1.7.0-99BBKgCWJJUA6aWVuD3QRz"

RDEPENDS:${PN} += "ghc-githash-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv"

inherit rpm
