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

RPM_NAME = "ghc-byteable-0.1.1-12.3.aarch64.rpm"
RPM_HASH = "17b92a401ec89261b691b89007b43e74846be586d7735705e6a14909252c8da01bdefae507a34997090942bd914497503ffe409e6e818de69084269434869101"

RPROVIDES:${PN} += "ghc-byteable \
libHSbyteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
