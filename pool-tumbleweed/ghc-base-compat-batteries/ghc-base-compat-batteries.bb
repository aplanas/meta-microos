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

RPM_NAME = "ghc-base-compat-batteries-0.13.0-1.3.aarch64.rpm"
RPM_HASH = "baeb8b6f38132da733d150d2c76a2c775452e929e49487af48f4852f2ee369330b16d72f9d19ae37e10ba4f4830825ac420c1fc35272668133b012089e12a162"

RPROVIDES:${PN} += "ghc-base-compat-batteries \
libHSbase-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.13.0-Cvz3167VMpo6rdOohSlum3-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfoldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
