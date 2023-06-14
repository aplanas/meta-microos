SUMMARY = "Boring and Absurd types"
DESCRIPTION = "* 'Boring' types are isomorphic to '()'. \
 \
* 'Absurd' types are isomorphic to 'Void'. \
 \
See [What does () mean in Haskell -answer by Conor \
McBride](https://stackoverflow.com/questions/33112439/what-does-mean-in-haskell/33115522#33115522)."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-boring-0.2.1-1.2.aarch64.rpm"
RPM_HASH = "74524173e3f7859bd0adf5d0544ef4594dd8a6bd678ec693159f4973b626d74cf3af369dabcd05c330aa4e9e8bc47e4182db990d814f4c85da3eacea890e52ab"

RPROVIDES:${PN} += "ghc-boring \
libHSboring-0.2.1-J8lJX6Vz53r2bssyBwOtpl-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
