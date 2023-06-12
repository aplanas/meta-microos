SUMMARY = "Haskell ed25519 profiling library"
DESCRIPTION = "This package provides the Haskell ed25519 profiling library."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-prof-0.0.5.0-16.2.aarch64.rpm"
RPM_HASH = "5b94355b89f74b3698fd59c7212130e764ed6fe987bcf5302bd823d005a95eea008a0b87aafc04acb0f1db29a126a53dfdde2a26cd5aa74ac981cfa4d01c0e4f"

RPROVIDES:${PN} += "ghc-ed25519-prof \
ghc-ed25519-prof(aarch-64) \
ghc-prof(ed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8)"
RDEPENDS:${PN} += "ghc-ed25519-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(ghc-prim-0.9.0)"

inherit rpm
