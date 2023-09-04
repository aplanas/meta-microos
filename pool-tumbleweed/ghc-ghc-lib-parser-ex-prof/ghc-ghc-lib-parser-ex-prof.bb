SUMMARY = "Haskell ghc-lib-parser-ex profiling library"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-prof-9.4.0.0-1.11.aarch64.rpm"
RPM_HASH = "69e4e798a411afabeefef1bf5cd8ae8161b229ec4ce34a5586ec08506d3d946863d48f4bfbdb718cf600be760f286b32afd199c82b7b7734cb2cb5fad0ebeb0a"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-prof \
ghc-prof-ghc-lib-parser-ex-9.4.0.0-FnsACeicRjR9lrHyF5i7Lw"

RDEPENDS:${PN} += "ghc-ghc-lib-parser-ex-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-lib-parser-9.4.6.20230808-BTkqGaXXohb8duAYJJlTmh \
ghc-prof-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX"

inherit rpm
