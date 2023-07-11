SUMMARY = "Haskell x509-store library development files"
DESCRIPTION = "This package provides the Haskell x509-store library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-devel-1.6.9-2.6.aarch64.rpm"
RPM_HASH = "33efe37bb57929140362709420ea5c0ea6f7484ea2938d592ceef08ea445a6873ddd7f08b1234cf0a33eb5d0ea998e9a8e5019065570253b11464f3c0d65901b"

RPROVIDES:${PN} += "ghc-devel-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-x509-store-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-devel-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS \
ghc-devel-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-x509-store"

inherit rpm
