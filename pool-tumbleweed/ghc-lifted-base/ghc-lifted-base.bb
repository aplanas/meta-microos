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

RPM_NAME = "ghc-lifted-base-0.2.3.12-8.6.aarch64.rpm"
RPM_HASH = "11dd6c39ded4494ee17ee811d7e833d52791b9ee682d75fa77ea2187c48057889be93a04e0f15784cece9b54b12f3ca230e85c3390d311d23e33fafcaa100c14"

RPROVIDES:${PN} += "ghc-lifted-base \
libHSlifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmonad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
