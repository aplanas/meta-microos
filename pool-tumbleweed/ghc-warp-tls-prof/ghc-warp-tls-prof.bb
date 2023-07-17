SUMMARY = "Haskell warp-tls profiling library"
DESCRIPTION = "This package provides the Haskell warp-tls profiling library."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-prof-3.3.6-1.7.aarch64.rpm"
RPM_HASH = "a7eff9760a48650cb5895814dd49e0505ec7040ea49cde749fd74353e32427459dfd0d74228b8708edfc0e20470e6bb176078c1c778f916480a66039670c799c"

RPROVIDES:${PN} += "ghc-prof-warp-tls-3.3.6-BIAYbi0ylEQD1wDWwu7oKA \
ghc-warp-tls-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-recv-0.1.0-5l0GOJwksOA59K6H5tIdgO \
ghc-prof-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-prof-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-prof-tls-session-manager-0.0.4-H4ntEZmH6lq6RcNU9soHmP \
ghc-prof-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-warp-3.3.25-EsJVhH2AisSK67jSo7D0GP \
ghc-warp-tls-devel"

inherit rpm
