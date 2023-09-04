SUMMARY = "Compatibile module for time-format locale"
DESCRIPTION = "This package contains wrapped name module for time-format locale between \
old-locale and time-1.5."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-0.1.1.5-7.3.aarch64.rpm"
RPM_HASH = "37cac2ff86dd5f397284a629fed92d5e09fa10bf220c774cc323fa5d8e489b792f88aaef2eb8666c4203ff16fd33ad56fa0f729eb255d9a3a5c870b6b1cc941c"

RPROVIDES:${PN} += "ghc-time-locale-compat \
libHStime-locale-compat-0.1.1.5-9kgo2YphD9418bVnFGy98u-ghc9.4.6.so"

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
