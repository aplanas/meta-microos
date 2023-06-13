SUMMARY = "Haskell warp-tls profiling library"
DESCRIPTION = "This package provides the Haskell warp-tls profiling library."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-prof-3.3.6-1.4.aarch64.rpm"
RPM_HASH = "2c5b743103d43ca0b46ca9c114374f50f40ea74654703bda3bb6289c7c0a964cbc56103b4950788bba2160034d2ae79ca3b54b2a8b16e8248f7cee7eaea2dcab"

RPROVIDES:${PN} += "ghc-prof(warp-tls-3.3.6-FNoL4BYqjr55niULiQgEjP) \
ghc-warp-tls-prof \
ghc-warp-tls-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) \
ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(recv-0.1.0-4koyrU2GJ4L4fpyKcXLbZR) \
ghc-prof(streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G) \
ghc-prof(tls-1.6.0-48osxqPawrs8SblkErmTaM) \
ghc-prof(tls-session-manager-0.0.4-1K8vLYLuq115RYgesNa5lw) \
ghc-prof(unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D) \
ghc-prof(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-prof(warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ) \
ghc-warp-tls-devel"

inherit rpm
