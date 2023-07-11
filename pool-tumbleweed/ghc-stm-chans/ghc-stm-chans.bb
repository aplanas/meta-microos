SUMMARY = "Additional types of channels for STM"
DESCRIPTION = "Additional types of channels for STM."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-3.0.0.9-1.6.aarch64.rpm"
RPM_HASH = "0b5de765d61a748d15b757dd69b7f8583682452f6181281b0f84aed8aedbc8423d83cc3b2f6595610b5c7ee9e3518c148750643ecd048878f7eba49812df76fb"

RPROVIDES:${PN} += "ghc-stm-chans \
libHSstm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
