SUMMARY = "Word8 library"
DESCRIPTION = "Word8 library to be used with Data.ByteString."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-0.1.3-5.8.aarch64.rpm"
RPM_HASH = "9c1a010a7be40e0a46851a7e3a9499240be3dc055046558aba97e6f85df6deb99e342900ab43b9bfed651548fb0b5da6d89d6082f40f9eafc1f307f04c23f0d6"

RPROVIDES:${PN} += "ghc-word8 \
libHSword8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
