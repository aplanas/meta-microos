SUMMARY = "Haskell filepath library development files"
DESCRIPTION = "This package provides the Haskell filepath library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-devel-1.4.2.2-3.2.aarch64.rpm"
RPM_HASH = "270dbfb6fb185a2e18e7653f848e499fd81546dbbe3dc7598ea29a12d3c8e051bbcb42298e3b21797b9a693878e099dfea5010f3b26997a1611751131e890b0b"

RPROVIDES:${PN} += "ghc-devel-filepath-1.4.2.2 \
ghc-filepath-devel \
ghc-filepath-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-filepath"

inherit rpm
