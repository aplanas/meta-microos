SUMMARY = "Haskell http-client-restricted library development files"
DESCRIPTION = "This package provides the Haskell http-client-restricted library \
development files."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-devel-0.0.5-2.8.aarch64.rpm"
RPM_HASH = "2a8bc396434200b686f77076c4ab74768d36a79886beb8bdd1f5b6180e108817d2b3f8ac7730eb74392b349768c875962a5e3f01ad259a3afd114eca8702cf40"

RPROVIDES:${PN} += "ghc-devel-http-client-restricted-0.0.5-6W52ptKb3gq2u8nffCvr0t \
ghc-http-client-restricted-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-connection-0.3.1-HritGhbYIMl4OD06E3KY8G \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-devel-http-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-http-client-restricted"

inherit rpm
