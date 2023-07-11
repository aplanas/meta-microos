SUMMARY = "Haskell base library development files"
DESCRIPTION = "This package provides the Haskell base library development files."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-devel-4.17.1.0-3.2.aarch64.rpm"
RPM_HASH = "ec9653712417ff162ec2e2553adf257bb4f600436abc48f8a45ef6421808861c638359b9b4c0f7a3de9d37cdb258f7cefcaf5d4f9996cc3e7b70777a95cf7adf"

RPROVIDES:${PN} += "ghc-base-devel \
ghc-base-static \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-bignum-1.3 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-integer-gmp-1.1 \
ghc-devel-rts-1.0.2 \
ghc-devel-system-cxx-std-lib-1.0"

RDEPENDS:${PN} += "ghc-base \
ghc-compiler \
gmp-devel \
libdw-devel \
libelf-devel \
libffi-devel \
libnuma-devel"

inherit rpm
