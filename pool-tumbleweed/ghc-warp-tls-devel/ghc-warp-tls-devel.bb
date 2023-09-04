SUMMARY = "Haskell warp-tls library development files"
DESCRIPTION = "This package provides the Haskell warp-tls library development files."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-devel-3.3.6-2.4.aarch64.rpm"
RPM_HASH = "4d92d5e39abaf8b4e08544a2e127a00d48445c3468b78f21c0d20d72745516569ae1e669dd405271be8aff60d5a2b9fd7678176242f088a6bf9e3b982690e6fc"

RPROVIDES:${PN} += "ghc-devel-warp-tls-3.3.6-C1oin3Li46xKIuifoCNImY \
ghc-warp-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-recv-0.1.0-E4Of8dJv2WfHRGIVsQUgMj \
ghc-devel-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-devel-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-devel-tls-session-manager-0.0.4-BZhuXicA1j0A1xtOmVohoA \
ghc-devel-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-warp-tls"

inherit rpm
