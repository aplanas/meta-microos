SUMMARY = "Haskell http-client library development files"
DESCRIPTION = "This package provides the Haskell http-client library development files."
LICENSE = "MIT"

PV = "0.7.13.1"

RPM_NAME = "ghc-http-client-devel-0.7.13.1-3.4.aarch64.rpm"
RPM_HASH = "d6521dbdd91c979ccf6e1e443b0131ee0d6f5a2219dc8e2a411a0100eb884f7e32a862d41cf456575ac9b42a62fbe6f44df3fda90f26d7b5cd2d01be150d7367"

RPROVIDES:${PN} += "ghc-devel-http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215 \
ghc-http-client-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-iproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd \
ghc-devel-mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm \
ghc-devel-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-stm-2.5.1.0 \
ghc-devel-streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-http-client"

inherit rpm
