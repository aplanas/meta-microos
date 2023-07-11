SUMMARY = "Haskell http-media library development files"
DESCRIPTION = "This package provides the Haskell http-media library development files."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-devel-0.8.0.0-6.6.aarch64.rpm"
RPM_HASH = "8943a0a8232c5f435b8eccf3d4d57cbca828d7f0b183770078f61b626deaf4aca83c183503ac8651e3be6453a375d08751973da233432a895a461aa612240f84"

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
