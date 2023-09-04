SUMMARY = "A class for types with a default value"
DESCRIPTION = "A class for types with a default value."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-data-default-class-0.1.2.0-10.3.aarch64.rpm"
RPM_HASH = "9cde5761915017ff2f6867995636b412ecab4b0bc84f6f2812bd8d7cf43946ee233c6b563d0abbc05839b90089c5e1cd7d62bdca8e886b3ff08ea78ca3cbc6cb"

RPROVIDES:${PN} += "ghc-data-default-class \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
