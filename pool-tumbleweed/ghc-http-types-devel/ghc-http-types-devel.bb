SUMMARY = "Haskell http-types library development files"
DESCRIPTION = "This package provides the Haskell http-types library development files."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-devel-0.12.3-6.6.aarch64.rpm"
RPM_HASH = "7db4ff48e22623f9e8b87c92239eb8b37d8fdd354473fc1adc73101556ee8660c02cfd931650b4cc950b8090d063db0ba36951fc3af21fcad54170506dd808b6"

RPROVIDES:${PN} += "ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-http-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-text-2.0.2 \
ghc-http-types"

inherit rpm
