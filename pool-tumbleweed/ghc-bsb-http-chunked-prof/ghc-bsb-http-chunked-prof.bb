SUMMARY = "Haskell bsb-http-chunked profiling library"
DESCRIPTION = "This package provides the Haskell bsb-http-chunked profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-prof-0.0.0.4-6.3.aarch64.rpm"
RPM_HASH = "2f970b7b7b0105c9de42689880e30978b856b6654442ae2a3aece598764626e10f6bb54bca178daf20033c2f5da8e3cd7eac830ea93155c9b4040e7984cf32f8"

RPROVIDES:${PN} += "ghc-bsb-http-chunked-prof \
ghc-prof-bsb-http-chunked-0.0.0.4-6Uz6ZfX3tBC2nOluTU0Lnf"

RDEPENDS:${PN} += "ghc-bsb-http-chunked-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
