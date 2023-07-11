SUMMARY = "Haskell warp library development files"
DESCRIPTION = "This package provides the Haskell warp library development files."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-devel-3.3.25-1.7.aarch64.rpm"
RPM_HASH = "11888dc452fc2e77f06dbfcc7c3f2b0a436dbde1e823fbb1691295b911918fe0638918575da5c99dcddc4bb1f6565025679e4f98a0ddf20cf2de90a9d0227e03"

RPROVIDES:${PN} += "ghc-devel-warp-3.3.25-7qOcByHeVpuMAFF4vrupa \
ghc-warp-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-devel-base-4.17.1.0 \
ghc-devel-bsb-http-chunked-0.0.0.4-7TdDxnBU7De3tUquWdckvl \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-http2-3.0.3-COVYRU9DHikEztQPG0mdmy \
ghc-devel-iproute-1.7.12-IhoklPQYItb8qGu1G3vmcD \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-recv-0.1.0-5l0GOJwksOA59K6H5tIdgO \
ghc-devel-simple-sendfile-0.2.32-4x5oTHfDDcT2QYoR9wedVb \
ghc-devel-stm-2.5.1.0 \
ghc-devel-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-devel-text-2.0.2 \
ghc-devel-time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj \
ghc-devel-unix-2.7.3 \
ghc-devel-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-devel-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-devel-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-devel-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-warp"

inherit rpm
