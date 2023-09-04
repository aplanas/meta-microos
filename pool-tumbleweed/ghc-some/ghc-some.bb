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

RPM_NAME = "ghc-some-1.0.5-1.8.aarch64.rpm"
RPM_HASH = "43c7e6e0d08922844b40e68475eb48de7884dd8a9f3951940a1b6cdfd37f77d800450289b2b796e4ce197fe25f4a3c68d7c4145cf917696d63671c16bba07d1a"

RPROVIDES:${PN} += "ghc-some \
libHSsome-1.0.5-EryUniFNYOB2ktd7SoyKUW-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
