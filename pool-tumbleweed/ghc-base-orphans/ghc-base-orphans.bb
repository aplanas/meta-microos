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

RPM_NAME = "ghc-base-orphans-0.8.8.2-1.2.aarch64.rpm"
RPM_HASH = "26b956c474b9eb46f11abd8827e6ac8d20d7e1530970be015aa71c40e23d8f15480fdbdc75bbc94df4879066ce7e8e53c4941894b549469155e988a25d6c95d2"

RPROVIDES:${PN} += "ghc-base-orphans \
ghc-base-orphans(aarch-64) \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
