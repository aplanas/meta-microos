SUMMARY = "Backwards-compatible orphan instances for base"
DESCRIPTION = "'base-orphans' defines orphan instances that mimic instances available in later \
versions of 'base' to a wider (older) range of compilers. \
'base-orphans' does not export anything except the orphan instances themselves \
and complements '<http://hackage.haskell.org/package/base-compat base-compat>'. \
 \
See the README for what instances are covered: \
<https://github.com/haskell-compat/base-orphans#readme>. See also the \
<https://github.com/haskell-compat/base-orphans#what-is-not-covered what is not \
covered> section."
LICENSE = "MIT"

PV = "0.8.8.2"

RPM_NAME = "ghc-base-orphans-0.8.8.2-1.3.aarch64.rpm"
RPM_HASH = "7bd7295f83924f9fdfcb9216660457801bffbd7f877b7439ca27a55476da245c5131421f78f2d5ffc550f7c501fb4e0fe09753a8938dacb30e86665ecc85514e"

RPROVIDES:${PN} += "ghc-base-orphans \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
