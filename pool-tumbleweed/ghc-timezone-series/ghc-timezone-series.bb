SUMMARY = "Enhanced timezone handling for Data.Time"
DESCRIPTION = "This package endows Data.Time, from the time package, with several data types \
and functions for enhanced processing of timezones. For one way to create \
timezone series, see the timezone-olson \
(<http://hackage.haskell.org/package/timezone-olson>) and timezone-olson-th \
(<http://hackage.haskell.org/package/timezone-olson-th>) packages."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-0.1.13-2.2.aarch64.rpm"
RPM_HASH = "692209ecebef4aaa0e4b026ea0e98a230516772c714ec5f4ca96973822f846d582d7157e18e5098be867b7b28585b8524fe03847da1380dc4464b2a65aea7603"

RPROVIDES:${PN} += "ghc-timezone-series \
ghc-timezone-series(aarch-64) \
libHStimezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
