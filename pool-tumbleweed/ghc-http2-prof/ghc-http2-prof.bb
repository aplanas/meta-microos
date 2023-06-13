SUMMARY = "Haskell http2 profiling library"
DESCRIPTION = "This package provides the Haskell http2 profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-prof-3.0.3-2.3.aarch64.rpm"
RPM_HASH = "62f8ee5ede045314f9fba7c8fd88eba8a275f5e9e744e53645446ffd428d408e67089b4085827146e460317e791ac54e0e08496d4bb7747f41f064471458791d"

RPROVIDES:${PN} += "ghc-http2-prof \
ghc-http2-prof(aarch-64) \
ghc-prof(http2-3.0.3-g8K2coD7lK8bFd8vR2MQJ)"

RDEPENDS:${PN} += "ghc-http2-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-prof(containers-0.6.7) \
ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(network-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO) \
ghc-prof(psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O) \
ghc-prof(stm-2.5.1.0) \
ghc-prof(time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj) \
ghc-prof(unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0)"

inherit rpm
