SUMMARY = "Haskell terminfo library"
DESCRIPTION = "This package provides the Haskell terminfo library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-0.4.1.5-3.1.aarch64.rpm"
RPM_HASH = "646565f57e72ffa1be6c9c76d2435eb5778ce8fd456e052993ee703292872f3611d07310bfce7800ac417e46836fafb27099501909470c5e341767d599b77a81"

RPROVIDES:${PN} += "ghc-terminfo \
ghc-terminfo(aarch-64) \
libHSterminfo-0.4.1.5-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
