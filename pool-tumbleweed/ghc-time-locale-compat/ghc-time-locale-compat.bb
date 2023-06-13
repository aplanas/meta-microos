SUMMARY = "Compatibile module for time-format locale"
DESCRIPTION = "This package contains wrapped name module for time-format locale between \
old-locale and time-1.5."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-0.1.1.5-7.2.aarch64.rpm"
RPM_HASH = "ef4d6ca36debf70651860d31fe81b353c87c26891ce40641597961b6164ec6a5e770cdd1c1f291618dd29ea6a223219f29df65b1480cffe0a65503e0ed25dcf7"

RPROVIDES:${PN} += "ghc-time-locale-compat \
ghc-time-locale-compat(aarch-64) \
libHStime-locale-compat-0.1.1.5-4KOdffkWEDD5CJkcMekvXY-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
