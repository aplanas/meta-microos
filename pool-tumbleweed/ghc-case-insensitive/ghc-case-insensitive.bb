SUMMARY = "Case insensitive string comparison"
DESCRIPTION = "The module 'Data.CaseInsensitive' provides the 'CI' type constructor which can \
be parameterised by a string-like type like: 'String', 'ByteString', 'Text', \
etc.. Comparisons of values of the resulting type will be insensitive to cases."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-1.2.1.0-6.4.aarch64.rpm"
RPM_HASH = "2812ffa1e60994a5a97d11d4c9948edcc77502eada072df7b275a4dbf711d609165e6b89ee8af1993c7a23b832e021d2b3353e146ac983f2d95632a30b9a64f8"

RPROVIDES:${PN} += "ghc-case-insensitive \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
