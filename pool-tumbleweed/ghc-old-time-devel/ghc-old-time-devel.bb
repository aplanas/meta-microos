SUMMARY = "Haskell old-time library development files"
DESCRIPTION = "This package provides the Haskell old-time library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-devel-1.1.0.3-13.4.aarch64.rpm"
RPM_HASH = "e2c5a0d2dd484451325d6dc811dd43069486f5a0ce0c670936a8b2b4d53b063f2e89c03bdcc614429228bcc682b99b8e570e7af12742976d18e1ec742dd93a13"

RPROVIDES:${PN} += "ghc-devel-old-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw \
ghc-old-time-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk \
ghc-old-time"

inherit rpm
