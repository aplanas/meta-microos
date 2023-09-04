SUMMARY = "Haskell safe-exceptions profiling library"
DESCRIPTION = "This package provides the Haskell safe-exceptions profiling library."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-prof-0.1.7.4-1.2.aarch64.rpm"
RPM_HASH = "0e506bf27f5a634c885c5090006ca4e882bf3db0cac243d6b8085fd4814e2b63dd2137e3764ac488a21ad49f431dec6c402a52f8db837a6cc16c068b49ff4243"

RPROVIDES:${PN} += "ghc-prof-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-safe-exceptions-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-transformers-0.5.6.2 \
ghc-safe-exceptions-devel"

inherit rpm
