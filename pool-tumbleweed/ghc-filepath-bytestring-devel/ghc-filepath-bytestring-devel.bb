SUMMARY = "Haskell filepath-bytestring library development files"
DESCRIPTION = "This package provides the Haskell filepath-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.13"

RPM_NAME = "ghc-filepath-bytestring-devel-1.4.2.1.13-1.5.aarch64.rpm"
RPM_HASH = "a47e05ad514b09cd3f1e9f496aecc10295778f220c9fff21dd4f5f9f687a57d4cb2f8f87c33eda47adc1ccb56984fecd081d8c7efdcdbc64c4d38a9d688fac01"

RPROVIDES:${PN} += "ghc-devel-filepath-bytestring-1.4.2.1.13-KgttGjs0pYw2aEgCzIFOnB \
ghc-filepath-bytestring-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-unix-2.7.3 \
ghc-filepath-bytestring"

inherit rpm
