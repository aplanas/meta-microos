SUMMARY = "Haskell monad-control profiling library"
DESCRIPTION = "This package provides the Haskell monad-control profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-prof-1.0.3.1-2.2.aarch64.rpm"
RPM_HASH = "1c89b4a1491a1a325e858d469acd25598548ad6163292a1bfc3d125b0d64127b32c0357998ec62d5d04411bdecb2c21fecb8c6e5c5fca4a9e442cb0cfa961045"

RPROVIDES:${PN} += "ghc-monad-control-prof ghc-monad-control-prof(aarch-64) ghc-prof(monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX)"
RDEPENDS:${PN} += "ghc-monad-control-devel ghc-prof(base-4.17.1.0) ghc-prof(stm-2.5.1.0) ghc-prof(transformers-0.5.6.2) ghc-prof(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp) ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
