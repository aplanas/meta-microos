SUMMARY = "Haskell http-client-restricted profiling library"
DESCRIPTION = "This package provides the Haskell http-client-restricted profiling library."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-prof-0.0.5-2.4.aarch64.rpm"
RPM_HASH = "ca764c0939d2dc316caaba2f4cb4a16b6e459a4e44e478fc5bb849a01ab6f497be017117015157b7d13d6977e0ef9881a04c8f283d1a834f0234aa18f3dacf94"

RPROVIDES:${PN} += "ghc-http-client-restricted-prof \
ghc-prof-http-client-restricted-0.0.5-4dQhIixHeHBzRZHp5uOpQ"

RDEPENDS:${PN} += "ghc-http-client-restricted-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-connection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-prof-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-network-bsd-2.8.1.0-K9geVudEUPh9zpSal1iibE \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q"

inherit rpm
