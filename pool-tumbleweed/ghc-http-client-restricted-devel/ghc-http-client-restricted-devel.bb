SUMMARY = "Haskell http-client-restricted library development files"
DESCRIPTION = "This package provides the Haskell http-client-restricted library \
development files."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-devel-0.0.5-2.7.aarch64.rpm"
RPM_HASH = "77d49d576d98930f081153fd72ede9f2057ce955bfb35df2469df3911be716e4ced84e9b07eaeba93cc10d838a43720c4c7efd06f94af4d50cb01187d205f1d3"

RPROVIDES:${PN} += "ghc-devel-http-client-restricted-0.0.5-7bkojuhKHVeBSlJlcYS59c \
ghc-http-client-restricted-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-connection-0.3.1-HritGhbYIMl4OD06E3KY8G \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-http-client-0.7.14-DEHi4b5z3Pa56fFNKIs9J1 \
ghc-devel-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-http-client-restricted"

inherit rpm
