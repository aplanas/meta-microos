SUMMARY = "Haskell control-monad-free library development files"
DESCRIPTION = "This package provides the Haskell control-monad-free library development \
files."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-devel-0.6.2-4.8.aarch64.rpm"
RPM_HASH = "dcb106dff16b5adc9a8e59d3211fafe8a7a4b4043aded895dc0c009afa62abaa44dd03a51a40603c12f82a82828dbe9bd63c9fdb7ce7edc17558ba2c94336a40"

RPROVIDES:${PN} += "ghc-control-monad-free-devel \
ghc-devel-control-monad-free-0.6.2-14mRW5Z3hOW3y0QtFAGsp6"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-control-monad-free \
ghc-devel-base-4.17.2.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
