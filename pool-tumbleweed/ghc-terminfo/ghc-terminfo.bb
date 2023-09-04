SUMMARY = "Haskell terminfo library"
DESCRIPTION = "This package provides the Haskell terminfo library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-0.4.1.5-1.1.aarch64.rpm"
RPM_HASH = "93d97507e3e946ec0a8aae3d08cbcd470b077973b091940253b287fdc52d1fea06d7eb08c82b9fff90eb600bfe24e790b428f36059c086b6c5dbbd954060b1f8"

RPROVIDES:${PN} += "ghc-terminfo \
libHSterminfo-0.4.1.5-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
