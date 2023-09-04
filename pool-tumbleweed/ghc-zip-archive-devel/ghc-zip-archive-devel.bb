SUMMARY = "Haskell zip-archive library development files"
DESCRIPTION = "This package provides the Haskell zip-archive library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-zip-archive-devel-0.4.3-1.3.aarch64.rpm"
RPM_HASH = "0be9d81dbb21aaceb005db09e6e05f91306ead31963e0cc810ceef32a57ee5ded477828d4f9ea9be3d31b539b3f3adb8a643d8bfd4fc46266d9ac16d3641a0b5"

RPROVIDES:${PN} += "ghc-devel-zip-archive-0.4.3-BovVKNnvnsMG9XB1oXeV8K \
ghc-zip-archive-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-digest-0.0.1.7-x22LVSWrXSB7L6QfE4JoE \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-zip-archive"

inherit rpm
