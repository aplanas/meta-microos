SUMMARY = "Haskell http-client-restricted profiling library"
DESCRIPTION = "This package provides the Haskell http-client-restricted profiling library."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-prof-0.0.5-2.8.aarch64.rpm"
RPM_HASH = "f9812f2a5bfe9a1fdc35b80efb93bd4aa8fbe0ba4e967d52a54c4cd044937e55fb12f4939798bddbf44336e9b52d1765327725e961dec38d3208c5cc393d8fb1"

RPROVIDES:${PN} += "ghc-http-client-restricted-prof \
ghc-prof-http-client-restricted-0.0.5-6W52ptKb3gq2u8nffCvr0t"

RDEPENDS:${PN} += "ghc-http-client-restricted-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-connection-0.3.1-HritGhbYIMl4OD06E3KY8G \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-prof-http-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
