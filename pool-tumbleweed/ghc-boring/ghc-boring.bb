SUMMARY = "Boring and Absurd types"
DESCRIPTION = "* 'Boring' types are isomorphic to '()'. \
 \
* 'Absurd' types are isomorphic to 'Void'. \
 \
See [What does () mean in Haskell -answer by Conor \
McBride](https://stackoverflow.com/questions/33112439/what-does-mean-in-haskell/33115522#33115522)."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-boring-0.2.1-1.4.aarch64.rpm"
RPM_HASH = "c5336cdb68b9a02ab3e6b54875063f59ec289c4543a9f5e9d46e4be1530163c12daf3751c0c9a2bdc5fd4123cc3b6f390f1acdf073a37fc60de38e604fc3df2a"

RPROVIDES:${PN} += "ghc-boring \
libHSboring-0.2.1-8UoR96J8uAp13B13xTdCnI-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
