SUMMARY = "Haskell base-compat-batteries profiling library"
DESCRIPTION = "This package provides the Haskell base-compat-batteries profiling library."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-batteries-prof-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "f12f8509c45f687d1bfe4d90c73e49ddf3d7c779f9d7f8b32a43ebecf5cf0ae6600ed5dd10fb2693166ec22fa23e2ed01056adcd2bad92910c13342b4bdcd229"

RPROVIDES:${PN} += "ghc-base-compat-batteries-prof \
ghc-prof-base-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW"

RDEPENDS:${PN} += "ghc-base-compat-batteries-devel \
ghc-prof-OneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-prof-foldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
