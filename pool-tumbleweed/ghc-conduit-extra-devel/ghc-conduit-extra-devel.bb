SUMMARY = "Haskell conduit-extra library development files"
DESCRIPTION = "This package provides the Haskell conduit-extra library development files."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "ghc-conduit-extra-devel-1.3.6-2.12.aarch64.rpm"
RPM_HASH = "0e3a1cd8965f855479f1c3c1c1b9858857b406880a5e4e79ae4d70aa1bb005b7b0fdd6ead2b7670d088d67df4ad553b562e760314e9e0cae0378f2939335470d"

RPROVIDES:${PN} += "ghc-conduit-extra-devel \
ghc-devel-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-conduit-extra \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-process-1.6.17.0 \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-stm-2.5.1.0 \
ghc-devel-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-typed-process-0.2.11.0-D02VU1fccqSD0M6BP6Pfz9 \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES"

inherit rpm
