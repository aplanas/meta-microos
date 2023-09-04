SUMMARY = "Haskell pretty-hex profiling library"
DESCRIPTION = "This package provides the Haskell pretty-hex profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-prof-1.1-4.3.aarch64.rpm"
RPM_HASH = "55a8307cec2635e5e9fb527aec32a0a0c384ecf50c7df07a024f3aa0333579051b2ea1aa9d4f9bc1d7a885bd5f4424155bb0fe45d2c4a162f38349e5d0a0f707"

RPROVIDES:${PN} += "ghc-pretty-hex-prof \
ghc-prof-pretty-hex-1.1-6nqTsc1Xx7vJSzZ0xX5VyC"

RDEPENDS:${PN} += "ghc-pretty-hex-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
