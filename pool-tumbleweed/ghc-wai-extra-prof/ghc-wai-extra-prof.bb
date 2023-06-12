SUMMARY = "Haskell wai-extra profiling library"
DESCRIPTION = "This package provides the Haskell wai-extra profiling library."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-prof-3.1.13.0-2.4.aarch64.rpm"
RPM_HASH = "c9a800e965c58f7d23ed9716eda016ac4951525343b6cfe07f76158334a89590722075f6266e7a50aca4523a3eb0038e0b3fdfef12496da08a9c67f48dba76d3"

RPROVIDES:${PN} += "ghc-prof(wai-extra-3.1.13.0-B4Szpcpv4Gy5mM28jLfYmX) \
ghc-wai-extra-prof \
ghc-wai-extra-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(HUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb) \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk) \
ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-prof(containers-0.6.7) \
ghc-prof(cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE) \
ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) \
ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-prof(iproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-prof(streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unix-2.7.3) \
ghc-prof(vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc) \
ghc-prof(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-prof(wai-logger-2.4.0-9XzUYLocOmA4DcbxilrxA0) \
ghc-prof(warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ) \
ghc-prof(word8-0.1.3-9uGjviso2af8K0EP8UmxRD) \
ghc-wai-extra-devel"

inherit rpm
