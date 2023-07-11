SUMMARY = "Haskell ed25519 profiling library"
DESCRIPTION = "This package provides the Haskell ed25519 profiling library."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-prof-0.0.5.0-16.3.aarch64.rpm"
RPM_HASH = "aa0ed4c7b18144cdb34768d27ff03a9e071fbaf675f3b9df6a5393caaf8ffae10cf15d301d865cc82d74b1a4fed0a56dac065d392911f4ebad3bdb9dce774b51"

RPROVIDES:${PN} += "ghc-ed25519-prof \
ghc-prof-ed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8"

RDEPENDS:${PN} += "ghc-ed25519-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
