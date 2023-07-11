SUMMARY = "Haskell x509-store profiling library"
DESCRIPTION = "This package provides the Haskell x509-store profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-prof-1.6.9-2.6.aarch64.rpm"
RPM_HASH = "9d33f4608d953f2f98fb51078e6593937cd62fff315505ac74a31616dc00436496a9b01613272d31b8aa2af6f5fa1d18edd74b21b954b4776c44e07a31d1c91b"

RPROVIDES:${PN} += "ghc-prof-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-x509-store-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-prof-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS \
ghc-prof-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-x509-store-devel"

inherit rpm
