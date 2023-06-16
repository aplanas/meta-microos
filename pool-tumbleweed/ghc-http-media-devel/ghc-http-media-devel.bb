SUMMARY = "Haskell http-media library development files"
DESCRIPTION = "This package provides the Haskell http-media library development files."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-devel-0.8.0.0-6.3.aarch64.rpm"
RPM_HASH = "c5b66239182989a307e0c4a1d32ebf53050e34b93474706066adc20bab9edda69ded1d8d946aab0e9ea8bf2866a49b0e3caf633f33ab78d6427630789feb6ca4"

RPROVIDES:${PN} += "ghc-devel-http-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU \
ghc-http-media-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-http-media"

inherit rpm
