SUMMARY = "Haskell tls profiling library"
DESCRIPTION = "This package provides the Haskell tls profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-prof-1.6.0-2.6.aarch64.rpm"
RPM_HASH = "8613854a3af04add05b09f7ca32f7c6344d9d9e56a574c9b8d525db971fcdb061bef1814e2cdf9b148792eb77ebdd3e9666c7b994450d2ab7f67f01380ae1e88"

RPROVIDES:${PN} += "ghc-prof-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-tls-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-prof-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-prof-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-prof-x509-validation-1.6.12-Ei5K1SyMjWXHl76z2VlUEo \
ghc-tls-devel"

inherit rpm
