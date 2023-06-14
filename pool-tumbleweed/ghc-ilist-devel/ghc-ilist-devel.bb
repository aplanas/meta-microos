SUMMARY = "Haskell ilist library development files"
DESCRIPTION = "This package provides the Haskell ilist library development files."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-ilist-devel-0.4.0.1-1.2.aarch64.rpm"
RPM_HASH = "ea82ee38f5ce8967602bb8fe15403799e050e5c38a1efa84d75da6209809a60f8192fbe20a902c30c4b5d0591b563b2e3e28141bb88f32a2e062d66935ca4a6c"

RPROVIDES:${PN} += "ghc-devel-ilist-0.4.0.1-KsvLIKFcqVNEl2m4LjZZwM \
ghc-ilist-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-ilist"

inherit rpm
