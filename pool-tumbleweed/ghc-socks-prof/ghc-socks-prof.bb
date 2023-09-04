SUMMARY = "Haskell socks profiling library"
DESCRIPTION = "This package provides the Haskell socks profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-prof-0.6.1-6.9.aarch64.rpm"
RPM_HASH = "58eb2ee1e0151cd2b1bd9222f0a3b2dbfb954368e865b5a921a039e3df807bf94b2715e66f20a85c991bf8df78224d4e8f8c3754990540ae7e786f8428e24c4d"

RPROVIDES:${PN} += "ghc-prof-socks-0.6.1-5RVEIbYAf8qJqchdUVHVHw \
ghc-socks-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-socks-devel"

inherit rpm
