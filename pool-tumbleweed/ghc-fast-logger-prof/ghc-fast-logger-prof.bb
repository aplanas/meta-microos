SUMMARY = "Haskell fast-logger profiling library"
DESCRIPTION = "This package provides the Haskell fast-logger profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-prof-3.1.2-1.10.aarch64.rpm"
RPM_HASH = "208cca7d5b2f5d12491d45a450a30c0e155b6479a6191d91472c56a0ebb206dee0f09757df7ccb9bf639fdb2ba632afcb288244d447daeaa991b74985fe6f87f"

RPROVIDES:${PN} += "ghc-fast-logger-prof \
ghc-prof-fast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q"

RDEPENDS:${PN} += "ghc-fast-logger-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-easy-file-0.2.5-Eune3nGPx4BABAmiN3TyxF \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-prof-unix-time-0.4.10-LpZG5YAXe572FFFZnKOLQq"

inherit rpm
