SUMMARY = "Haskell http-client profiling library"
DESCRIPTION = "This package provides the Haskell http-client profiling library."
LICENSE = "MIT"

PV = "0.7.13.1"

RPM_NAME = "ghc-http-client-prof-0.7.13.1-3.7.aarch64.rpm"
RPM_HASH = "a234dfaae6f54f1f3785da382f627f2ed8dc4cbac09187e1f2c77d13f14185c2ce20c6346964bb23e7ed05e8a4a2e3bd9c9a603e577e73b6b29ccc2315f183ec"

RPROVIDES:${PN} += "ghc-http-client-prof \
ghc-prof-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ"

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
ghc-prof-iproute-1.7.12-IhoklPQYItb8qGu1G3vmcD \
ghc-prof-mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-stm-2.5.1.0 \
ghc-prof-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
