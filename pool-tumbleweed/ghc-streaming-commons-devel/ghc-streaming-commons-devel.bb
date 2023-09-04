SUMMARY = "Haskell streaming-commons library development files"
DESCRIPTION = "This package provides the Haskell streaming-commons library development \
files."
LICENSE = "MIT"

PV = "0.2.2.6"

RPM_NAME = "ghc-streaming-commons-devel-0.2.2.6-1.10.aarch64.rpm"
RPM_HASH = "dc1f2a07d96e4c71f09b6edbd8de7026d445e2b5e28ec047305173aad18947bd8413c07f178e7b93692b24ef3373eec3e9672980c5c31f6667d9c203856ea300"

RPROVIDES:${PN} += "ghc-devel-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-streaming-commons-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-process-1.6.17.0 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-stm-2.5.1.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-streaming-commons"

inherit rpm
