SUMMARY = "Haskell http-client-tls profiling library"
DESCRIPTION = "This package provides the Haskell http-client-tls profiling library."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-prof-0.3.6.1-2.4.aarch64.rpm"
RPM_HASH = "2d6f03b3a58d14b6a914581e231208556a065b077397fcce8a347371628543d2465baf89fdc0a779036e7bf1d65e814409be4324ddac2e97c8d182a42274f57b"

RPROVIDES:${PN} += "ghc-http-client-tls-prof \
ghc-prof-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7"

RDEPENDS:${PN} += "ghc-http-client-tls-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-connection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-exceptions-0.10.5 \
ghc-prof-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-text-2.0.2 \
ghc-prof-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-prof-transformers-0.5.6.2"

inherit rpm
