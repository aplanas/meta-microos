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

RPM_NAME = "ghc-monad-control-1.0.3.1-2.2.aarch64.rpm"
RPM_HASH = "2f9fa140f6e63132c0feb38eea971e4e40f8aae770e86e7a14875f00204ad56712fb7a9bbc1069ff51f3c28373a8d486e13655e203c0f434314795224d744ddb"

RPROVIDES:${PN} += "ghc-monad-control \
ghc-monad-control(aarch-64) \
libHSmonad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
