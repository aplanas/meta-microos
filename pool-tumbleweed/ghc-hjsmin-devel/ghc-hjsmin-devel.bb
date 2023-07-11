SUMMARY = "Haskell hjsmin library development files"
DESCRIPTION = "This package provides the Haskell hjsmin library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-devel-0.2.1-1.5.aarch64.rpm"
RPM_HASH = "c4cb40d6a7ebc6204f6b10c848fd496bb8875ccf8ad7f7ac4ac63972ef7ba67625bac816473db3321dd710baa399f951c56683de7e67bba305e48a7753e4d706"

RPROVIDES:${PN} += "ghc-devel-hjsmin-0.2.1-E05vLEwNeV76Uzm2zhD4uI \
ghc-hjsmin-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-language-javascript-0.7.1.0-3FqnIQtG3956Mxug7EpqjM \
ghc-devel-text-2.0.2 \
ghc-hjsmin"

inherit rpm
