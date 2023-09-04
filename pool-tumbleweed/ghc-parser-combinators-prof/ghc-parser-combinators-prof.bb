SUMMARY = "Haskell parser-combinators profiling library"
DESCRIPTION = "This package provides the Haskell parser-combinators profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-prof-1.3.0-2.8.aarch64.rpm"
RPM_HASH = "ce1a2362c5462b0d53724ee83123e7392b0ca5e688a07d80cb0cac1df52b8050ffe800c65a964e9af5e740e659a0a33f3094c498fc6d9982b2e7b1617fe967ae"

RPROVIDES:${PN} += "ghc-parser-combinators-prof \
ghc-prof-parser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ"

RDEPENDS:${PN} += "ghc-parser-combinators-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
