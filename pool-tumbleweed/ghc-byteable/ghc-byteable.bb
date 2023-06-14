SUMMARY = "Type class for sequence of bytes"
DESCRIPTION = "Abstract class to manipulate sequence of bytes \
 \
The use case of this class is abstracting manipulation of types that are just \
wrapping a bytestring with stronger and more meaniful name. \
 \
Usual definition of those types are of the form: newtype MyType = MyType \
ByteString."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-0.1.1-12.2.aarch64.rpm"
RPM_HASH = "099df540fcb53d53781480e0a157fccacb276de96a47a761213f65c64823bacc4d26e05e5f36d505a429edc1118d43ec7d8b7464c956af857c93ba4c04e25e07"

RPROVIDES:${PN} += "ghc-byteable \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
