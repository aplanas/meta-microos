SUMMARY = "Haskell wai-extra library development files"
DESCRIPTION = "This package provides the Haskell wai-extra library development files."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-devel-3.1.13.0-2.4.aarch64.rpm"
RPM_HASH = "9325b4a3270244f16b72391d62ec83c81c2c9396e40bbc70e87a6ce6ed13292dab8003112b15759391897b3d7e6d91a1fd6e0a7a13bf795bfb793e1863a93a94"

RPROVIDES:${PN} += "ghc-devel-wai-extra-3.1.13.0-B4Szpcpv4Gy5mM28jLfYmX \
ghc-wai-extra-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-HUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-directory-1.3.7.1 \
ghc-devel-fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-iproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd \
ghc-devel-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-devel-wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn \
ghc-devel-wai-logger-2.4.0-9XzUYLocOmA4DcbxilrxA0 \
ghc-devel-warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ \
ghc-devel-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-wai-extra"

inherit rpm
