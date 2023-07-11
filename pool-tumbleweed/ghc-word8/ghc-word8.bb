SUMMARY = "Word8 library"
DESCRIPTION = "Word8 library to be used with Data.ByteString."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-0.1.3-5.6.aarch64.rpm"
RPM_HASH = "033e5a66431399dfa05db91f76757db9b8a6297e58380455c5a7b20d97bd14488edf49e6a10cae6ce3eef796df9e4ce8675bbb5042f1d4e8f9933195c4fd9525"

RPROVIDES:${PN} += "ghc-word8 \
libHSword8-0.1.3-9uGjviso2af8K0EP8UmxRD-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
