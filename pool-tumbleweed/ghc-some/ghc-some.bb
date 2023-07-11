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

RPM_NAME = "ghc-some-1.0.5-1.6.aarch64.rpm"
RPM_HASH = "7ea0a56504dcedd53a339af0f30baa2ddd2861ba56a25b60b3e762377334b638f8038c168ec2ae43f4321073bb5760306311684efc3cd3d227b68a3663cb4d82"

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
