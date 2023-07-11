SUMMARY = "Haskell x509 profiling library"
DESCRIPTION = "This package provides the Haskell x509 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.7"

RPM_NAME = "ghc-x509-prof-1.7.7-2.6.aarch64.rpm"
RPM_HASH = "d717c723a07ff0cdc379a0606ddb4f38ec44c33472c2fc7878273216e7dd03d68d33475db6da835a324b7f30ae33ce8617988c1a5bf463cff67e52134025e7c8"

RPROVIDES:${PN} += "ghc-prof-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-x509-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-prof-asn1-parse-0.9.5-HTg4KkpVBwF8NdUaqkTqJm \
ghc-prof-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-prof-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS \
ghc-prof-transformers-0.5.6.2 \
ghc-x509-devel"

inherit rpm
