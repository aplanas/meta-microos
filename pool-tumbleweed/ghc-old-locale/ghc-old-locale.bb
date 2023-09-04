SUMMARY = "Locale library"
DESCRIPTION = "This package provides the ability to adapt to locale conventions such as date \
and time formats."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-1.0.0.7-13.3.aarch64.rpm"
RPM_HASH = "31d531d1d7eb70583290295a39f547396dda4583f6294ba98f6b51923b5c27413267eb8318fca22c911d14c086628fafb7d78d07ae2788d70ecb35a51809a094"

RPROVIDES:${PN} += "ghc-old-locale \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
