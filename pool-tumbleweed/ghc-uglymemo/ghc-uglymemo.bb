SUMMARY = "A simple (but internally ugly) memoization function"
DESCRIPTION = "A simple (but internally ugly) memoization function. \
 \
* New in 0.1.0.1: Make it exception safe."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-0.1.0.1-4.2.aarch64.rpm"
RPM_HASH = "12d11fb17292dca28b13497f4c8f2ce0614aad96bbaff55d8f5614e19229f20358708ecb20f93691efdb510b5a4eed3a24d9bdcc7d0f6e2f3cbc199ea12fbf17"

RPROVIDES:${PN} += "ghc-uglymemo \
libHSuglymemo-0.1.0.1-Balkr8KlO4bDeailuusufT-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
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
