SUMMARY = "Haskell OneTuple profiling library"
DESCRIPTION = "This package provides the Haskell OneTuple profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-OneTuple-prof-0.3.1-4.2.aarch64.rpm"
RPM_HASH = "a53dd0defef7fa47c2433b7e03876a3b6f8031783762aae6a5ba53ca304ee87e81636b5aabd44adf576b40562af605aec063ecc880e76a46a214df1b1b2fc0cd"

RPROVIDES:${PN} += "ghc-OneTuple-prof \
ghc-OneTuple-prof(aarch-64) \
ghc-prof(OneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd)"
RDEPENDS:${PN} += "ghc-OneTuple-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(template-haskell-2.19.0.0)"

inherit rpm
