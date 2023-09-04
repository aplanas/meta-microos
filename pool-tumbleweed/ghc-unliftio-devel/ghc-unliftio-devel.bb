SUMMARY = "Haskell unliftio library development files"
DESCRIPTION = "This package provides the Haskell unliftio library development files."
LICENSE = "MIT"

PV = "0.2.25.0"

RPM_NAME = "ghc-unliftio-devel-0.2.25.0-1.7.aarch64.rpm"
RPM_HASH = "4aaaa92b1ee1279e01144c9f7410c751cc40a403ab2c2f12a8960652d8093fdd25d9a931ae83d716880023988689f503e365fbb2a3cb4f55237c722a10d8aff7"

RPROVIDES:${PN} += "ghc-devel-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-unliftio-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-devel-stm-2.5.1.0 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-unliftio"

inherit rpm
