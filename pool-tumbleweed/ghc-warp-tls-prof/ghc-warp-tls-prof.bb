SUMMARY = "Haskell warp-tls profiling library"
DESCRIPTION = "This package provides the Haskell warp-tls profiling library."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-prof-3.3.6-1.8.aarch64.rpm"
RPM_HASH = "b976478774eb01022f53f0057627c3298a3b3273c309334d42aa36722fe9c881637655b91853022a1976fc9b0096153b2e8ba01d36ddc641eefded87137a79fe"

RPROVIDES:${PN} += "ghc-prof-warp-tls-3.3.6-6emvz7T7HmGIqf2xAyfin8 \
ghc-warp-tls-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-recv-0.1.0-5l0GOJwksOA59K6H5tIdgO \
ghc-prof-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-prof-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-prof-tls-session-manager-0.0.4-E4DLe19pSesGogH0zlyp57 \
ghc-prof-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-warp-3.3.25-EsJVhH2AisSK67jSo7D0GP \
ghc-warp-tls-devel"

inherit rpm
