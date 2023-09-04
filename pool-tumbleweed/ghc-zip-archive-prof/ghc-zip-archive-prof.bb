SUMMARY = "Haskell zip-archive profiling library"
DESCRIPTION = "This package provides the Haskell zip-archive profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-zip-archive-prof-0.4.3-1.3.aarch64.rpm"
RPM_HASH = "1b460ed3a8d310bdc5c355fd6ee596ebd0b6e15baff223d481930554d9e138d6b12e2c23d60fc292cdcac496ef72126a36358d44d9059ba4da3aa5e4c6b3a411"

RPROVIDES:${PN} += "ghc-prof-zip-archive-0.4.3-BovVKNnvnsMG9XB1oXeV8K \
ghc-zip-archive-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-digest-0.0.1.7-x22LVSWrXSB7L6QfE4JoE \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-zip-archive-devel"

inherit rpm
