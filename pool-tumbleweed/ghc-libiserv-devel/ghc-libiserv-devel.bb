SUMMARY = "Haskell libiserv library development files"
DESCRIPTION = "This package provides the Haskell libiserv library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-libiserv-devel-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "36742df1caced362478f3c124991f29a535b94f00936d82ddd181e83abca79ed2f21ea8abdf543a400484d2d863820d59064c0ad2be23f1fdc15e90d59a80839"

RPROVIDES:${PN} += "ghc-devel-libiserv-9.4.6 \
ghc-libiserv-devel \
ghc-libiserv-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghci-9.4.6 \
ghc-devel-unix-2.7.3 \
ghc-libiserv"

inherit rpm
