SUMMARY = "A simple (but internally ugly) memoization function"
DESCRIPTION = "A simple (but internally ugly) memoization function. \
 \
* New in 0.1.0.1: Make it exception safe."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-0.1.0.1-4.3.aarch64.rpm"
RPM_HASH = "311bbaec1028c85e7f4d2679478f4c3f7e2e294c1407bbd404c78d568efeb4f6ef0212b1a13847b26202692567ee6dd902fe5d1fb7404baf997482d9eab4670a"

RPROVIDES:${PN} += "ghc-uglymemo \
libHSuglymemo-0.1.0.1-FaxrSjBe3XhIHSfEZHhJ9C-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
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
