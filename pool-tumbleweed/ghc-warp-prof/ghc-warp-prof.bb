SUMMARY = "Haskell warp profiling library"
DESCRIPTION = "This package provides the Haskell warp profiling library."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-prof-3.3.25-1.9.aarch64.rpm"
RPM_HASH = "11f8951fc1e8860fe49afad13a370cfb545084311e9ecf19bf6b142543cb6332de67560acb47f55a2ddc701a215008ec4ff5e8a578ee52b5978866fab95c5f63"

RPROVIDES:${PN} += "ghc-prof-warp-3.3.25-EsJVhH2AisSK67jSo7D0GP \
ghc-warp-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-prof-base-4.17.1.0 \
ghc-prof-bsb-http-chunked-0.0.0.4-7TdDxnBU7De3tUquWdckvl \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-http2-3.0.3-C8jMo1PWq0Httjut7cZnE \
ghc-prof-iproute-1.7.12-IhoklPQYItb8qGu1G3vmcD \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-recv-0.1.0-5l0GOJwksOA59K6H5tIdgO \
ghc-prof-simple-sendfile-0.2.32-4x5oTHfDDcT2QYoR9wedVb \
ghc-prof-stm-2.5.1.0 \
ghc-prof-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-prof-text-2.0.2 \
ghc-prof-time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj \
ghc-prof-unix-2.7.3 \
ghc-prof-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-prof-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-prof-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-prof-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-warp-devel"

inherit rpm
