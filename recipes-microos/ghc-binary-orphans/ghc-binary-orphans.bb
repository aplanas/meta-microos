SUMMARY = "Compatibility package for binary; provides instances"
DESCRIPTION = "This package provides instances defined in later versions of 'binary' package \
 \
Prior version 1 this packages provided instances for other packages. \
That functionality is moved to \
[binary-instances](https://hackage.haskell.org/package/binary-instances) \
package."
LICENSE = "BSD-3-Clause"

PV = "1.0.4.1"

RPM_NAME = "ghc-binary-orphans-1.0.4.1-1.2.aarch64.rpm"
RPM_HASH = "0726047e60db0b5e8103a231dd0a497270604627be40ebfc5d1e651ce86554af39bc076dd29f497d621ae5592e692cdb5725da402333367dfd2ddb3274010bf1"

RPROVIDES:${PN} += "ghc-binary-orphans \
ghc-binary-orphans(aarch-64) \
libHSbinary-orphans-1.0.4.1-B9MBRQ7HLuSFecvHRdMPIR-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
