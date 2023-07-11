SUMMARY = "Haskell cmdargs library development files"
DESCRIPTION = "This package provides the Haskell cmdargs library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-devel-0.10.22-1.6.aarch64.rpm"
RPM_HASH = "9c07b4d27250b1aa53d6659d8179950f1864c68c50d51946956fc1d541f4f25226fff3b1323fb0a1b55beb592dec6f2ac0699727b95082f8d94207873a71b758"

RPROVIDES:${PN} += "ghc-cmdargs-devel \
ghc-devel-cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cmdargs \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
