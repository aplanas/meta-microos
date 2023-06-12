SUMMARY = "Haskell streaming-commons profiling library"
DESCRIPTION = "This package provides the Haskell streaming-commons profiling library."
LICENSE = "MIT"

PV = "0.2.2.6"

RPM_NAME = "ghc-streaming-commons-prof-0.2.2.6-1.3.aarch64.rpm"
RPM_HASH = "6874848e122ca9136a6d21e689ad4a8ee39865ac3dae6c368050a2a32de250f096656063f8d0891a90a83ba23196cc267b290e35e01660ebe074861b4741d691"

RPROVIDES:${PN} += "ghc-prof(streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G) \
ghc-streaming-commons-prof \
ghc-streaming-commons-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) \
ghc-prof(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(process-1.6.16.0) \
ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-prof(stm-2.5.1.0) \
ghc-prof(text-2.0.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unix-2.7.3) \
ghc-prof(zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk) \
ghc-streaming-commons-devel"

inherit rpm
