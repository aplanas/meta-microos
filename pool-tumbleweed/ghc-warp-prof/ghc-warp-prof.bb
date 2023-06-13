SUMMARY = "Haskell warp profiling library"
DESCRIPTION = "This package provides the Haskell warp profiling library."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-prof-3.3.25-1.4.aarch64.rpm"
RPM_HASH = "a84ad3f9b4956a0e4a69d3627606ff8b21f950ca1197099591bf31c3b1dd97cf7692264010d61f0ae6856c8d734e69104142380a85f8498317d240f3857c2b33"

RPROVIDES:${PN} += "ghc-prof(warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ) \
ghc-warp-prof \
ghc-warp-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) \
ghc-prof(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bsb-http-chunked-0.0.0.4-7TdDxnBU7De3tUquWdckvl) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-prof(containers-0.6.7) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD) \
ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-prof(http2-3.0.3-g8K2coD7lK8bFd8vR2MQJ) \
ghc-prof(iproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(recv-0.1.0-4koyrU2GJ4L4fpyKcXLbZR) \
ghc-prof(simple-sendfile-0.2.31-701wssQD34oFyvrTLOblUT) \
ghc-prof(stm-2.5.1.0) \
ghc-prof(streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G) \
ghc-prof(text-2.0.2) \
ghc-prof(time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj) \
ghc-prof(unix-2.7.3) \
ghc-prof(unix-compat-0.6-79KxxZMmklx25hsmeEnenN) \
ghc-prof(unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D) \
ghc-prof(vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc) \
ghc-prof(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-prof(word8-0.1.3-9uGjviso2af8K0EP8UmxRD) \
ghc-prof(x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw) \
ghc-warp-devel"

inherit rpm
