SUMMARY = "Haskell base-compat-batteries library development files"
DESCRIPTION = "This package provides the Haskell base-compat-batteries library development \
files."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-batteries-devel-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "f12b97640b6699ecae850608f3260c6c542b2c45a235b92dfd647cae2f9d173dd5d3b15c71750de9efcce092cb9cc6b76821949aa6ff3e4991ea78eba121d278"

RPROVIDES:${PN} += "ghc-base-compat-batteries-devel \
ghc-devel-base-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-compat-batteries \
ghc-compiler \
ghc-devel-OneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-devel-foldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy \
ghc-devel-ghc-prim-0.9.1"

inherit rpm
