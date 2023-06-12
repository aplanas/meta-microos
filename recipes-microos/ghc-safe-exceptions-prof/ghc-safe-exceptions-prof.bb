SUMMARY = "Haskell safe-exceptions profiling library"
DESCRIPTION = "This package provides the Haskell safe-exceptions profiling library."
LICENSE = "MIT"

PV = "0.1.7.3"

RPM_NAME = "ghc-safe-exceptions-prof-0.1.7.3-2.2.aarch64.rpm"
RPM_HASH = "820261e37cf116c8be562036bbafb341ab43f560417519caa9f7cafd199f30f448995c05592ed6b197545d9ebd1dfc680555e89a6cf1c300c8cead1e9e6b0b71"

RPROVIDES:${PN} += "ghc-prof(safe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD) \
ghc-safe-exceptions-prof \
ghc-safe-exceptions-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(transformers-0.5.6.2) \
ghc-safe-exceptions-devel"

inherit rpm
