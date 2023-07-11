SUMMARY = "Haskell http-client-restricted library development files"
DESCRIPTION = "This package provides the Haskell http-client-restricted library \
development files."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-devel-0.0.5-2.4.aarch64.rpm"
RPM_HASH = "f55dc951f3cbaaaf1f4c2733c0afcfe41e8558d62cc8455f9bb678cc45a5e6448093dc399dae664d8b10f0fdf71cd7bb8244df9f803cb41b86afa33124930cad"

RPROVIDES:${PN} += "ghc-devel-http-client-restricted-0.0.5-4dQhIixHeHBzRZHp5uOpQ \
ghc-http-client-restricted-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-connection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-devel-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-network-bsd-2.8.1.0-K9geVudEUPh9zpSal1iibE \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-http-client-restricted"

inherit rpm
