SUMMARY = "Haskell http-media profiling library"
DESCRIPTION = "This package provides the Haskell http-media profiling library."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-prof-0.8.0.0-6.6.aarch64.rpm"
RPM_HASH = "4de09e5295304c4fbc284a9ffb68ab441bb08db13e24e975a564e64c751518ec49ad56e2e8b6d44206ebf834402c6d1d61f07a830f121d6cb0b7ba9ae59f390e"

RPROVIDES:${PN} += "ghc-http-media-prof \
ghc-prof-http-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU"

RDEPENDS:${PN} += "ghc-http-media-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q"

inherit rpm
