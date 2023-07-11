SUMMARY = "Haskell tls library development files"
DESCRIPTION = "This package provides the Haskell tls library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-devel-1.6.0-2.6.aarch64.rpm"
RPM_HASH = "654905bb7f37692f95404f19b3d10d4b321143db196fa70f30e6c2ba655f97e326ca63b81049caa29fa82d2c22b1039486395222fc336e206b9b79964585590d"

RPROVIDES:${PN} += "ghc-devel-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-devel-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-devel-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-devel-x509-validation-1.6.12-Ei5K1SyMjWXHl76z2VlUEo \
ghc-tls"

inherit rpm
