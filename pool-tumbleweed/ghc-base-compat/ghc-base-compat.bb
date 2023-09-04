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

RPM_NAME = "ghc-base-compat-0.13.0-1.5.aarch64.rpm"
RPM_HASH = "c89d699d17a2ad331690640598ec12c6138fcb5a3db6d5d812dfa30824fa6b297ea5fd967b0e88d8748ab0291584665b858a018598146faf05ef7a0f4aefe5ae"

RPROVIDES:${PN} += "ghc-base-compat \
libHSbase-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
