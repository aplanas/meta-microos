SUMMARY = "Haskell control-monad-free library development files"
DESCRIPTION = "This package provides the Haskell control-monad-free library development \
files."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-devel-0.6.2-4.3.aarch64.rpm"
RPM_HASH = "ee04802c00cae2ddade49343ebf303738e7895f9772342ae8ce0b424c2a399dfe3147524a35bb59a00685928009501ea47c812eda04dda53cac04a2162f1b2cb"

RPROVIDES:${PN} += "ghc-control-monad-free-devel \
ghc-devel-control-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-control-monad-free \
ghc-devel-base-4.17.1.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
