SUMMARY = "Haskell call-stack library development files"
DESCRIPTION = "This package provides the Haskell call-stack library development files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-devel-0.4.0-2.8.aarch64.rpm"
RPM_HASH = "a66cd4610342ba344af44ea2d40ab2a1c52b62806dc306121e9836ecc79c70524e5dccf22137ae40a47cf1001835232335166f36ff4bcb887d06c8c85170a973"

RPROVIDES:${PN} += "ghc-call-stack-devel \
ghc-devel-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-call-stack \
ghc-compiler \
ghc-devel-base-4.17.2.0"

inherit rpm
