SUMMARY = "Utilities for indexed profunctors"
DESCRIPTION = "This package contains basic definitions related to indexed profunctors. \
These are primarily intended as internal utilities to support the 'optics' and \
'generic-lens' package families."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-0.1.1.1-1.2.aarch64.rpm"
RPM_HASH = "393b1934da8e9babf3b5abd6a8bbd45814b4052724ed5dde63a05fface7dcac2764597c315a368989c8519a7b7677a543829beb228b01c1af7bb5744f6ae69b7"

RPROVIDES:${PN} += "ghc-indexed-profunctors \
libHSindexed-profunctors-0.1.1.1-8VFnw8ahpDVCAreg6vEIe9-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
