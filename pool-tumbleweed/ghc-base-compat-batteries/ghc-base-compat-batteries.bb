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

PV = "0.12.2"

RPM_NAME = "ghc-base-compat-batteries-0.12.2-2.3.aarch64.rpm"
RPM_HASH = "6d344182d3461aa525615bf06bb1485650560af799267808766a423059a091b081ff82cfbb6648f78b52b048c7f461275759c434faf2ca8fa79267ff1760416b"

RPROVIDES:${PN} += "ghc-base-compat-batteries \
libHSbase-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov-ghc9.4.5.so \
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
