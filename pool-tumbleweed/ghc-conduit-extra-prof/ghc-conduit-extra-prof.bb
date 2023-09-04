SUMMARY = "Haskell conduit-extra profiling library"
DESCRIPTION = "This package provides the Haskell conduit-extra profiling library."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "ghc-conduit-extra-prof-1.3.6-2.12.aarch64.rpm"
RPM_HASH = "699fd1e657c6372dae87e914e4cf4548000e403b55f9fefc1a9162895e2e33c9b2bfaa4253a2d653aefa0924b764412072f31052ff0fac46d22c7903e329465a"

RPROVIDES:${PN} += "ghc-conduit-extra-prof \
ghc-prof-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf"

RDEPENDS:${PN} += "ghc-conduit-extra-devel \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-process-1.6.17.0 \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-stm-2.5.1.0 \
ghc-prof-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-typed-process-0.2.11.0-D02VU1fccqSD0M6BP6Pfz9 \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES"

inherit rpm
