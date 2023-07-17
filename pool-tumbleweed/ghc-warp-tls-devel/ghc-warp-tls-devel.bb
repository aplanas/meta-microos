SUMMARY = "Haskell warp-tls library development files"
DESCRIPTION = "This package provides the Haskell warp-tls library development files."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-devel-3.3.6-1.7.aarch64.rpm"
RPM_HASH = "c7c34a0897988f104b08217a29a596f7315ed12015174a38b6ee2b71d94a77cb85f18e70d4473f8e16c831c3e4d31a2b2438a1bac4d0bb4fb04a19413cfaacca"

RPROVIDES:${PN} += "ghc-devel-warp-tls-3.3.6-BIAYbi0ylEQD1wDWwu7oKA \
ghc-warp-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-recv-0.1.0-5l0GOJwksOA59K6H5tIdgO \
ghc-devel-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-devel-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-devel-tls-session-manager-0.0.4-H4ntEZmH6lq6RcNU9soHmP \
ghc-devel-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-warp-3.3.25-EsJVhH2AisSK67jSo7D0GP \
ghc-warp-tls"

inherit rpm
