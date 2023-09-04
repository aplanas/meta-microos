SUMMARY = "Haskell basement profiling library"
DESCRIPTION = "This package provides the Haskell basement profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-prof-0.0.16-1.5.aarch64.rpm"
RPM_HASH = "8da2625cfb8a47d1ece4b1b8ce3a8e95b7520c0ce84f49d1a6b3245d7648056d5c5d5a862f855deb17758d49ca563fdb453d19ae5df26f5a05b37bc220f02289"

RPROVIDES:${PN} += "ghc-basement-prof \
ghc-prof-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9"

RDEPENDS:${PN} += "ghc-basement-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
