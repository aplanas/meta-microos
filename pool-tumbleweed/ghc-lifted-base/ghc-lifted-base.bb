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

RPM_NAME = "ghc-lifted-base-0.2.3.12-8.3.aarch64.rpm"
RPM_HASH = "691f5975b51b3e6c18350286d1d49c611daedc9a86d811b3e0fe44e3f89720fb553cc4ed8fd4ad2f80594f714f6b0a115145f3675de5d88fe2f073a7de47d799"

RPROVIDES:${PN} += "ghc-lifted-base \
ghc-lifted-base(aarch-64) \
libHSlifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmonad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
