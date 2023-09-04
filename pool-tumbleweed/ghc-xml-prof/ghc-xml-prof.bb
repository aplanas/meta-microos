SUMMARY = "Haskell xml profiling library"
DESCRIPTION = "This package provides the Haskell xml profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-prof-1.3.14-13.8.aarch64.rpm"
RPM_HASH = "7a41577ab5cfe7854ef66e40d8f456bff9962e10b95e73a82475897ef600a5736674b86332cd224ae5719dd905dfd81aa0f8c24262d1021e6b01685fa41cb8c4"

RPROVIDES:${PN} += "ghc-prof-xml-1.3.14-JgZFWdUND2BGObIBmJlnFJ \
ghc-xml-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2 \
ghc-xml-devel"

inherit rpm
