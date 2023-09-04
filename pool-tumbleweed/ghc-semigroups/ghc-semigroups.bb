SUMMARY = "Anything that associates"
DESCRIPTION = "In mathematics, a semigroup is an algebraic structure consisting of a set \
together with an associative binary operation. A semigroup generalizes a monoid \
in that there might not exist an identity element. It also (originally) \
generalized a group (a monoid with all inverses) to a type where every element \
did not have to have an inverse, thus the name semigroup."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "ghc-semigroups-0.20-2.3.aarch64.rpm"
RPM_HASH = "aac82b79d50b4e25ea034719d53a5923305f147cb1464d9529bacb719dcfdacb7bcff851e25828162d45e3c56b4f0b554e7b17944bce023c72149fd226e59e88"

RPROVIDES:${PN} += "ghc-semigroups \
libHSsemigroups-0.20-6lktLD0mxwZ1Pjuc7q3dSl-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
