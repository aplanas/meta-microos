SUMMARY = "Base-compat with extra batteries"
DESCRIPTION = "Provides functions available in later versions of 'base' to a wider range of \
compilers, without requiring you to use CPP pragmas in your code. \
 \
This package provides the same API as the \
'<http://hackage.haskell.org/package/base-compat base-compat>' library, but \
depends on compatibility packages (such as 'semigroups') to offer a wider \
support window than 'base-compat', which has no dependencies. Most of the \
modules in this library have the same names as in 'base-compat' to make it \
easier to switch between the two. There also exist versions of each module with \
the suffix '.Repl.Batteries', which are distinct from anything in \
'base-compat', to allow for easier use in GHCi. \
 \
See \
'<https://github.com/haskell-compat/base-compat/blob/master/base-compat/README.markdown#dependencies \
here>' for a more comprehensive list of differences between 'base-compat' and \
'base-compat-batteries'."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-batteries-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "454f28b588364c582de5a60d9045064ea4dbfed059e86e9daa60a171a56119aae20f63c582eb3533872c1032e14869095e661711b823f66867185026dbcfcb4b"

RPROVIDES:${PN} += "ghc-base-compat-batteries \
libHSbase-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
