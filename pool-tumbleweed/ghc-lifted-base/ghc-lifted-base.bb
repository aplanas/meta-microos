SUMMARY = "Lifted IO operations from the base library"
DESCRIPTION = "'lifted-base' exports IO operations from the base library lifted to any \
instance of 'MonadBase' or 'MonadBaseControl'. \
 \
Note that not all modules from 'base' are converted yet. If you need a lifted \
version of a function from 'base', just ask me to add it or send me a patch. \
 \
The package includes a copy of the 'monad-peel' testsuite written by Anders \
Kaseorg The tests can be performed using 'cabal test'."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-0.2.3.12-8.8.aarch64.rpm"
RPM_HASH = "6690d5cbcefa17fefed87095a818d70b05e365efd19d4937a109cc2ed2fee90f2d42159e7bd372784aad5d6d61b738f4302dc852e8f98e1912bb8be3b61e4c57"

RPROVIDES:${PN} += "ghc-lifted-base \
libHSlifted-base-0.2.3.12-8AMs8PuCeaLKJwoieZv4GI-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmonad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
