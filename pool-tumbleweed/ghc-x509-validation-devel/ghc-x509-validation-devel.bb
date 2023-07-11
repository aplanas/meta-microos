SUMMARY = "Haskell x509-validation library development files"
DESCRIPTION = "This package provides the Haskell x509-validation library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.6.12"

RPM_NAME = "ghc-x509-validation-devel-1.6.12-2.6.aarch64.rpm"
RPM_HASH = "728c966d78c224aca4e37dbf47ff735ea4e224a3e648d9bfd7d5e2b858278e2d8c2eb367c63d9ba9665f3ed2de145b4bd22d80e5de2469234c227d3a8f1cf068"

RPROVIDES:${PN} += "ghc-devel-x509-validation-1.6.12-Ei5K1SyMjWXHl76z2VlUEo \
ghc-x509-validation-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-devel-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-mtl-2.2.2 \
ghc-devel-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS \
ghc-devel-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-devel-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-x509-validation"

inherit rpm
