SUMMARY = "Haskell colourista library development files"
DESCRIPTION = "This package provides the Haskell colourista library development files."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-devel-0.1.0.2-1.3.aarch64.rpm"
RPM_HASH = "e3d3301178e3b1e9b6d87e49f6b7761694bee9bab94555249034ccd3374828e0a96ef464e13676ef30d9866f280236babaf529d53fc4f71c6246d2168bd53f70"

RPROVIDES:${PN} += "ghc-colourista-devel \
ghc-colourista-devel(aarch-64) \
ghc-devel(colourista-0.1.0.2-5hJOPOBvzIt9IdOCkudaU3)"
RDEPENDS:${PN} += "/bin/sh \
ghc-colourista \
ghc-compiler \
ghc-devel(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(text-2.0.2)"

inherit rpm
