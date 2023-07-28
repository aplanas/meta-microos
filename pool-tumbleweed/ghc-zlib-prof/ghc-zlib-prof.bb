SUMMARY = "Haskell zlib profiling library"
DESCRIPTION = "This package provides the Haskell zlib profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-prof-0.6.3.0-3.1.aarch64.rpm"
RPM_HASH = "9104b9e0f7593d3a9e3cf7301b3e1fdf5363c7de9df1208dd914e4af1121530f12455acfd48ec498b27e255b3aec3fa82e0d9b08d4e03109f458feebbf99458a"

RPROVIDES:${PN} += "ghc-prof-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-zlib-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-zlib-devel"

inherit rpm
