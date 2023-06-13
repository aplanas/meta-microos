SUMMARY = "Generically newtype to use with DerivingVia"
DESCRIPTION = "This is a compatibility package as 'Generically' and 'Generically1' newtypes \
are available since 'base-4.17' in 'GHC.Generics'."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "81ebb14ad4700a6a8e3cd24b7ed0169276c36fbc34de9d2bc826215d46582edf4e9d2b989dcb3f61b54008a0e8bdbad063b2d7bed32b80901d0a6a41e7a53f7f"

RPROVIDES:${PN} += "ghc-generically \
ghc-generically(aarch-64) \
libHSgenerically-0.1.1-9IDkuVjdBOA27Mdybf3GBx-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
