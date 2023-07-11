SUMMARY = "Various small helper functions for Lists, Maybes, Tuples, Functions"
DESCRIPTION = "Various small helper functions for Lists, Maybes, Tuples, Functions. \
Some of these functions are improved implementations of standard functions. \
They have the same name as their standard counterparts. Others are equivalent \
to functions from the 'base' package, but if you import them from this utility \
package then you can write code that runs on older GHC versions or other \
compilers like Hugs and JHC. \
 \
All modules are plain Haskell 98. The package depends exclusively on the 'base' \
package and only that portions of 'base' that are simple to port. Thus you do \
not risk a dependency avalanche by importing it. However, further splitting the \
base package might invalidate this statement. \
 \
Alternative packages: 'Useful', 'MissingH'."
LICENSE = "BSD-3-Clause"

PV = "0.0.17"

RPM_NAME = "ghc-utility-ht-0.0.17-1.3.aarch64.rpm"
RPM_HASH = "cadc576d9f70f322e799d9d71426454b69c5e53b90f8e531ca77eab9cfebde46d1213eef364460281e66fc798a1de557515c2060ff31d1bdfb35054bb6fb0116"

RPROVIDES:${PN} += "ghc-utility-ht \
libHSutility-ht-0.0.17-3onflAp0qnlITa4Vy6FXwy-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
