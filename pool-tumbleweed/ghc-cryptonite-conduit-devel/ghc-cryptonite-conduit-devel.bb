SUMMARY = "Haskell cryptonite-conduit library development files"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-devel-0.2.2-9.3.aarch64.rpm"
RPM_HASH = "a9dc0a50a93a8da7c7a8e14ab7896ca660cf64219a7b4e07fa607cd17d81e40322c0ba57d8de1cc803b2184a556a555a2944c172b2bdb02e3ffa35020272d27b"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-devel \
ghc-devel-cryptonite-conduit-0.2.2-Ic5yZAN3MwnLmQgFse4azZ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptonite-conduit \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2 \
ghc-devel-conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr \
ghc-devel-cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye \
ghc-devel-exceptions-0.10.5 \
ghc-devel-memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-transformers-0.5.6.2"

inherit rpm
