SUMMARY = "Haskell http-client profiling library"
DESCRIPTION = "This package provides the Haskell http-client profiling library."
LICENSE = "MIT"

PV = "0.7.13.1"

RPM_NAME = "ghc-http-client-prof-0.7.13.1-3.4.aarch64.rpm"
RPM_HASH = "cf0b2cec2390f8c6bfbbf3a72fc12817a94c1861d13a71b23740becfeb66b6b44cd68d92f84e6f662b4f93e6986bd210c183fe79196ef349c1f1032943004ff8"

RPROVIDES:${PN} += "ghc-http-client-prof \
ghc-prof-http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215"

RDEPENDS:${PN} += "ghc-http-client-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-iproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd \
ghc-prof-mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm \
ghc-prof-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-stm-2.5.1.0 \
ghc-prof-streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
