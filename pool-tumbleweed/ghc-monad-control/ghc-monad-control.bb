SUMMARY = "Lift control operations, like exception catching, through monad transformers"
DESCRIPTION = "This package defines the type class 'MonadBaseControl', a subset of 'MonadBase' \
into which generic control operations such as 'catch' can be lifted from 'IO' \
or any other base monad. Instances are based on monad transformers in \
'MonadTransControl', which includes all standard monad transformers in the \
'transformers' library except 'ContT'. \
 \
See the <http://hackage.haskell.org/package/lifted-base lifted-base> package \
which uses 'monad-control' to lift 'IO' operations from the 'base' library \
(like 'catch' or 'bracket') into any monad that is an instance of 'MonadBase' \
or 'MonadBaseControl'. \
 \
Note that this package is a rewrite of Anders Kaseorg's 'monad-peel' library. \
The main difference is that this package provides CPS style operators and \
exploits the 'RankNTypes' and 'TypeFamilies' language extensions to simplify \
and speedup most definitions."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-1.0.3.1-2.3.aarch64.rpm"
RPM_HASH = "41d4d837c46b84df48b7d25d541353e6b471b8308a459723775f89a1759acb4916499774f247adf59c3e9dfb4986cc756a9b1ace5013512bfa27627d27462a79"

RPROVIDES:${PN} += "ghc-monad-control \
libHSmonad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
