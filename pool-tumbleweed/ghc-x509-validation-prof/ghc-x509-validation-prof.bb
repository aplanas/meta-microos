SUMMARY = "Haskell x509-validation profiling library"
DESCRIPTION = "This package provides the Haskell x509-validation profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.12"

RPM_NAME = "ghc-x509-validation-prof-1.6.12-2.6.aarch64.rpm"
RPM_HASH = "bc2314b4d85897488c9a1abe9f58c43bade7436a8ae38c112748109f8f9c47ecadc75ecf3fca5e80bba3a638fc362b807d9a7a2491f96fb2b2ea50055ac0e214"

RPROVIDES:${PN} += "ghc-prof-x509-validation-1.6.12-Ei5K1SyMjWXHl76z2VlUEo \
ghc-x509-validation-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-prof-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-prof-mtl-2.2.2 \
ghc-prof-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS \
ghc-prof-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-prof-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-x509-validation-devel"

inherit rpm
