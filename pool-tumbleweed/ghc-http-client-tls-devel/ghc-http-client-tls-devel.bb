SUMMARY = "Haskell http-client-tls library development files"
DESCRIPTION = "This package provides the Haskell http-client-tls library development \
files."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-devel-0.3.6.1-2.4.aarch64.rpm"
RPM_HASH = "3ca483c614275d7aba422490ecd4df01a897e9edf1d7be120b86f1cc877fcf20914863b3f339f905ec8ccf10657e6e66f68bf3e4bc58f216eb8a0f8fa2804880"

RPROVIDES:${PN} += "ghc-devel-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-http-client-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-connection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-exceptions-0.10.5 \
ghc-devel-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-text-2.0.2 \
ghc-devel-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-devel-transformers-0.5.6.2 \
ghc-http-client-tls"

inherit rpm
