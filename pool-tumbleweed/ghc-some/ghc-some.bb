SUMMARY = "Existential type: Some"
DESCRIPTION = "This library defines an existential type 'Some'. \
 \
' data Some f where Some :: f a -> Some f ' \
 \
in few variants, and utilities to work with it. \
 \
If you are unsure which variant to use, use the one in 'Data.Some' module."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "ad6636ccbd3dc82e264dbae3bbab0fdf0373587bb786985a1f610417f3145329c7fed491c8f71abe6f874a0f9483f13b4f5a5d9cc4b1c1f9cbabe01bb5d745db"

RPROVIDES:${PN} += "ghc-some \
libHSsome-1.0.5-3dwCpkSImpx8T8axxRPR3Z-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
