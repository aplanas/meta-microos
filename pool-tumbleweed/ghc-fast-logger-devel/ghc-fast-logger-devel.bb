SUMMARY = "Haskell fast-logger library development files"
DESCRIPTION = "This package provides the Haskell fast-logger library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-devel-3.1.2-1.7.aarch64.rpm"
RPM_HASH = "6ba97de169f8d2cc99cf3e15676f390d51e9f31b597366e074638e019ae7dbea2c0dc09e7e465c0b3a599ad9798124fff67ada6c93d4f83c0b6c267d47e9ed40"

RPROVIDES:${PN} += "ghc-devel-fast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN \
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
ghc-devel-unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0 \
ghc-fast-logger"

inherit rpm
