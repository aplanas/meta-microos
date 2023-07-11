SUMMARY = "A compatibility layer for base"
DESCRIPTION = "Provides functions available in later versions of 'base' to a wider range of \
compilers, without requiring you to use CPP pragmas in your code. See the \
<https://github.com/haskell-compat/base-compat/blob/master/base-compat/README.markdown \
README> for what is covered. Also see the \
<https://github.com/haskell-compat/base-compat/blob/master/base-compat/CHANGES.markdown \
changelog> for recent changes. \
 \
Note that 'base-compat' does not add any orphan instances. There is a separate \
package, '<http://hackage.haskell.org/package/base-orphans base-orphans>', for \
that. \
 \
In addition, 'base-compat' does not backport any data types or type classes. \
See \
'<https://github.com/haskell-compat/base-compat/blob/master/base-compat/README.markdown#data-types-and-type-classes \
this section of the README>' for more info. \
 \
'base-compat' is designed to have zero dependencies. For a version of \
'base-compat' that depends on compatibility libraries for a wider support \
window, see the '<http://hackage.haskell.org/package/base-compat-batteries \
base-compat-batteries>' package. Most of the modules in this library have the \
same names as in 'base-compat-batteries' to make it easier to switch between \
the two. There also exist versions of each module with the suffix '.Repl', \
which are distinct from anything in 'base-compat-batteries', to allow for \
easier use in GHCi."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-0.13.0-1.3.aarch64.rpm"
RPM_HASH = "33c5a07045d4f8ad9e9a6cd64c16f8f3ea4f979faf56c4d86a0acf756f160d7a64d8c91b62a26e95d27278709bc198957dacd5b92ca49ead5d72d52e16e7cc2c"

RPROVIDES:${PN} += "ghc-base-compat \
libHSbase-compat-0.13.0-Cvz3167VMpo6rdOohSlum3-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
