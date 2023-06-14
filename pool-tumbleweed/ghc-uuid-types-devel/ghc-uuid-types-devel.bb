SUMMARY = "Haskell uuid-types library development files"
DESCRIPTION = "This package provides the Haskell uuid-types library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-uuid-types-devel-1.0.5-5.2.aarch64.rpm"
RPM_HASH = "0a85982ffb2a85897ef36041fa4ec7fe1e76e8daa6357ac26daaf7a92bef47a58ba18d5c7ac1af88582558629436860491500cb1131082f67877a26e4593ccc0"

RPROVIDES:${PN} += "ghc-devel-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-uuid-types-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-uuid-types"

inherit rpm
