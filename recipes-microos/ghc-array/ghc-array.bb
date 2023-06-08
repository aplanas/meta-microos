SUMMARY = "Haskell array library"
DESCRIPTION = "This package provides the Haskell array library."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-0.5.4.0-1.1.aarch64.rpm"
RPM_HASH = "169b8dfa2b36153130eea1015e2db1e037b692c0c5431dd9ece14b713b7e566ce96605ac98f1f381573264fcb7af52fc2f2de65150023d590d6e8c1f6b925204"

RPROVIDES:${PN} += "ghc-array ghc-array(aarch-64) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
