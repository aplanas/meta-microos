SUMMARY = "Haskell terminfo library"
DESCRIPTION = "This package provides the Haskell terminfo library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-0.4.1.5-1.1.aarch64.rpm"
RPM_HASH = "fe301de8e4a6b50989220345253abd4a26e7987d6d8f8a28700b67076e5f53b7f1ade55a530f94bca89e98daf69e1b6686d680c1df00e503d02696b1955218dd"

RPROVIDES:${PN} += "ghc-terminfo ghc-terminfo(aarch-64) libHSterminfo-0.4.1.5-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
