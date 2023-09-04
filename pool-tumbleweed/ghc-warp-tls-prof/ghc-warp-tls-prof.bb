SUMMARY = "Haskell warp-tls profiling library"
DESCRIPTION = "This package provides the Haskell warp-tls profiling library."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-prof-3.3.6-2.4.aarch64.rpm"
RPM_HASH = "48b2e23e05c09a93f10919c79ea62fd5a8a0648dc9925d1828df342b7d42de9b6f31b3f0c44d9ceb76e5b594b26ba57128e7960e7a30ea283451c391f367f009"

RPROVIDES:${PN} += "ghc-prof-warp-tls-3.3.6-C1oin3Li46xKIuifoCNImY \
ghc-warp-tls-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-recv-0.1.0-E4Of8dJv2WfHRGIVsQUgMj \
ghc-prof-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-prof-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-prof-tls-session-manager-0.0.4-BZhuXicA1j0A1xtOmVohoA \
ghc-prof-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-warp-tls-devel"

inherit rpm
