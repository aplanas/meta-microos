SUMMARY = "Haskell filepath library development files"
DESCRIPTION = "This package provides the Haskell filepath library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-devel-1.4.2.2-1.1.aarch64.rpm"
RPM_HASH = "16793bb19f379d7cc27a7238813151375b7c05790ed88e4164614c9b29d5f3c21ec2681d8cf02851552bd7ebac8db2921fa6424cc9c78b6df42a574c0cf516a0"

RPROVIDES:${PN} += "ghc-devel-filepath-1.4.2.2 \
ghc-filepath-devel \
ghc-filepath-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-filepath"

inherit rpm
