SUMMARY = "Haskell iproute library development files"
DESCRIPTION = "This package provides the Haskell iproute library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-devel-1.7.12-2.9.aarch64.rpm"
RPM_HASH = "68f65949dd3bc37813f116c7aba0de25a71152d8ae5d7873cd447dccff8d539e96cbbda5c868fcd810ace050bb864516029d3d8f0b967a12fb5268bf89e6ce3a"

RPROVIDES:${PN} += "ghc-devel-iproute-1.7.12-A34D1N9dJmL5ps3agDCHa7 \
ghc-iproute-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-appar-0.1.8-1lWb1vtDAvc6rz1D87iAo \
ghc-devel-base-4.17.2.0 \
ghc-devel-byteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-iproute"

inherit rpm
