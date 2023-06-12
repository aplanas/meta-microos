SUMMARY = "Haskell base-compat-batteries profiling library"
DESCRIPTION = "This package provides the Haskell base-compat-batteries profiling library."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "ghc-base-compat-batteries-prof-0.12.2-2.3.aarch64.rpm"
RPM_HASH = "a92dd8c540884ee80b02dd877324655b681f6d69443614416020aef40c078c37e9f7deed68d718ec9d8f48b4fc61d32351f2306dafef8fa4eeba84b5d7d08757"

RPROVIDES:${PN} += "ghc-base-compat-batteries-prof \
ghc-base-compat-batteries-prof(aarch-64) \
ghc-prof(base-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy)"
RDEPENDS:${PN} += "ghc-base-compat-batteries-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) \
ghc-prof(ghc-prim-0.9.0)"

inherit rpm
