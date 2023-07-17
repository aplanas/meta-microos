SUMMARY = "Haskell fast-logger library development files"
DESCRIPTION = "This package provides the Haskell fast-logger library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-devel-3.1.2-1.10.aarch64.rpm"
RPM_HASH = "013e8dfd28c7ae0b880c55d848b6affa4a77fd34577de5cc24a910d35b9d6e81f5ae21aa45d73249d923cf9944daebde6c461bf395a40a134930e275b58085ea"

RPROVIDES:${PN} += "ghc-devel-fast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q \
ghc-fast-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-easy-file-0.2.5-Eune3nGPx4BABAmiN3TyxF \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-devel-unix-time-0.4.10-LpZG5YAXe572FFFZnKOLQq \
ghc-fast-logger"

inherit rpm
