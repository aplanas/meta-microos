SUMMARY = "Haskell base library development files"
DESCRIPTION = "This package provides the Haskell base library development files."
LICENSE = "BSD-3-Clause"

PV = "4.17.2.0"

RPM_NAME = "ghc-base-devel-4.17.2.0-1.1.aarch64.rpm"
RPM_HASH = "a058b81dc4bd387fa883493fa4a00e9a791d02cada4266d9b04f8f9ecdda8a55023851b94a46c7ae4bcddaa97d9d240f3cf6b90f80f8480a83d238b70c93b599"

RPROVIDES:${PN} += "ghc-base-devel \
ghc-base-static \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-bignum-1.3 \
ghc-devel-ghc-prim-0.9.1 \
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
