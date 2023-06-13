SUMMARY = "Additional types of channels for STM"
DESCRIPTION = "Additional types of channels for STM."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-3.0.0.9-1.3.aarch64.rpm"
RPM_HASH = "1b5974edf32ff4d8c435a39fd3136fd324b53aa58ce0be3d0f875828f61725e92534acb7c4ff3e55d25c234dd5731208a9d8d1d18e4bc668dee5c1738eee55bd"

RPROVIDES:${PN} += "ghc-stm-chans \
ghc-stm-chans(aarch-64) \
libHSstm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
