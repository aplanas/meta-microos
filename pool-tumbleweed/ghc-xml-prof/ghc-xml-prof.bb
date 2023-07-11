SUMMARY = "Haskell xml profiling library"
DESCRIPTION = "This package provides the Haskell xml profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-prof-1.3.14-13.6.aarch64.rpm"
RPM_HASH = "2d0f0f065976ace854fec4da3bcaa933f5640a215509dc19e2232fd865fa38f59897ccf04f105039af58cde2dd8be626a02dbab8fe148a36cf88528c2cfb0eb8"

RPROVIDES:${PN} += "ghc-prof-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-xml-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2 \
ghc-xml-devel"

inherit rpm
