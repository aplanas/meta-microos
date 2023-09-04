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

RPM_NAME = "ghc-utility-ht-0.0.17-1.5.aarch64.rpm"
RPM_HASH = "10994af3bdf48684b117f09c880e613c4b16ba620d2677ef545abaf806ec185794ee46ab9bd4df6634d0e637d8fab9826db767b4f8a542c8e0c7af6518bebcad"

RPROVIDES:${PN} += "ghc-utility-ht \
libHSutility-ht-0.0.17-7cPYZhnhJbDGSMxoZBrT62-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
