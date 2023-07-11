SUMMARY = "Haskell fast-logger profiling library"
DESCRIPTION = "This package provides the Haskell fast-logger profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-prof-3.1.2-1.7.aarch64.rpm"
RPM_HASH = "1e4b71b80c7873afe49f3481e6d2107dd5ff02e9f22f467f5e8ad9040f8f1d481cf6913e34acc8e8e8e1515255f7df3d0f80d434f96a4cba0a56600a30302855"

RPROVIDES:${PN} += "ghc-fast-logger-prof \
ghc-prof-fast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN"

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
ghc-prof-unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0"

inherit rpm
