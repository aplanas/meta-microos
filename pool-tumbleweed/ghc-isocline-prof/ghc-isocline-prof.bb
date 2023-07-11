SUMMARY = "Haskell isocline profiling library"
DESCRIPTION = "This package provides the Haskell isocline profiling library."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-prof-1.0.9-1.6.aarch64.rpm"
RPM_HASH = "42ea02153281b190c536e0178ecfa85c6e9a780037f161882201ed79e262c29f004268fc5ae4420f2b05f35fd0ba98d532643dfb3aaf772adfa196b1ff39c81f"

RPROVIDES:${PN} += "ghc-isocline-prof \
ghc-prof-isocline-1.0.9-7x8dFWbXh69GJxYhigSqXG"

RDEPENDS:${PN} += "ghc-isocline-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
