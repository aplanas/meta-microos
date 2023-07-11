SUMMARY = "Haskell unliftio-core library development files"
DESCRIPTION = "This package provides the Haskell unliftio-core library development files."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-devel-0.2.1.0-1.6.aarch64.rpm"
RPM_HASH = "997ff9f312b8471fc1f4df9e6e2d9bdce876633ec62a3121ef344a97f6705aec491911180115fced54afb40f2644c82c89faf151c17fb303407080917a513bd8"

RPROVIDES:${PN} += "ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-unliftio-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-unliftio-core"

inherit rpm
