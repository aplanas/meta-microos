SUMMARY = "Haskell hslua-core profiling library"
DESCRIPTION = "This package provides the Haskell hslua-core profiling library."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-prof-2.3.1-1.8.aarch64.rpm"
RPM_HASH = "acd108abe777058f74c2deb97578491f24bebc551ad6e0b737d8d1f114bcd203ec74aa3b8547a698b11a58df8f14be1d8c41ad121c1b0a5a98faa08097da8890"

RPROVIDES:${PN} += "ghc-hslua-core-prof \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk"

RDEPENDS:${PN} += "ghc-hslua-core-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
