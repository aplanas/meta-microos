SUMMARY = "Haskell type-equality library development files"
DESCRIPTION = "This package provides the Haskell type-equality library development files."
LICENSE = "BSD-3-Clause"

PV = "1"

RPM_NAME = "ghc-type-equality-devel-1-11.3.aarch64.rpm"
RPM_HASH = "609f3ccbd150a9cf5659150507313ff00b2b22dfdfdbe42e4d437a9860e0b544f425ce2254bf5590c50339c095a0074f661b52f9269ef4d9085924e553762f36"

RPROVIDES:${PN} += "ghc-devel-type-equality-1-GeDZojRKCH6645jDbV5JLU \
ghc-type-equality-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-type-equality"

inherit rpm
