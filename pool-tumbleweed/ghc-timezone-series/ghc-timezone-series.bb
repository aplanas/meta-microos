SUMMARY = "Enhanced timezone handling for Data.Time"
DESCRIPTION = "This package endows Data.Time, from the time package, with several data types \
and functions for enhanced processing of timezones. For one way to create \
timezone series, see the timezone-olson \
(<http://hackage.haskell.org/package/timezone-olson>) and timezone-olson-th \
(<http://hackage.haskell.org/package/timezone-olson-th>) packages."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-0.1.13-2.3.aarch64.rpm"
RPM_HASH = "90b9d3d7cd0584e40d9947fb448f34f568047294b8411b922d2dda4d6d5167a4c22a78fe7a0cd3d5842182cb03faca693de20c4b7f14a5dce70a230557e0e91f"

RPROVIDES:${PN} += "ghc-timezone-series \
libHStimezone-series-0.1.13-IHWQx2h4brT4vl06IuBnhA-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
