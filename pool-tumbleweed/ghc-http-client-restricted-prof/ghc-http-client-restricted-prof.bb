SUMMARY = "Haskell http-client-restricted profiling library"
DESCRIPTION = "This package provides the Haskell http-client-restricted profiling library."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-prof-0.0.5-2.7.aarch64.rpm"
RPM_HASH = "3cbb4d3a25989dc552b5594ecfc65c9437a548e3f10bca28397b9129cccb0dec86228edb80f4bc217a9813f317f4d549229610d86d45e70e190e7524ce9690eb"

RPROVIDES:${PN} += "ghc-http-client-restricted-prof \
ghc-prof-http-client-restricted-0.0.5-7bkojuhKHVeBSlJlcYS59c"

RDEPENDS:${PN} += "ghc-http-client-restricted-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-connection-0.3.1-HritGhbYIMl4OD06E3KY8G \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-http-client-0.7.14-DEHi4b5z3Pa56fFNKIs9J1 \
ghc-prof-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
