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

PV = "0.12.2"

RPM_NAME = "ghc-base-compat-0.12.2-2.3.aarch64.rpm"
RPM_HASH = "bbe1323746b4baa9a02bf15b8a768c302a5a25661c585c5248b3461f860e49d60978771ef9590bfb6d1cb3da8929d4d7e2f8b5609a9aaa6d9408ec208a177d22"

RPROVIDES:${PN} += "ghc-base-compat \
ghc-base-compat(aarch-64) \
libHSbase-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
