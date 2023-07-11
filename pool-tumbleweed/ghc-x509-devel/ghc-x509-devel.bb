SUMMARY = "Haskell x509 library development files"
DESCRIPTION = "This package provides the Haskell x509 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.7"

RPM_NAME = "ghc-x509-devel-1.7.7-2.6.aarch64.rpm"
RPM_HASH = "ce4af41f58aa091bb945e44f392312961f45e547358b4b9c59a5a71a6dc0399a4828404045f42d7af31e14cfeb3651c6f3480ddbbec036c03c11cfca32877bae"

RPROVIDES:${PN} += "ghc-devel-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-x509-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-devel-asn1-parse-0.9.5-HTg4KkpVBwF8NdUaqkTqJm \
ghc-devel-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS \
ghc-devel-transformers-0.5.6.2 \
ghc-x509"

inherit rpm
