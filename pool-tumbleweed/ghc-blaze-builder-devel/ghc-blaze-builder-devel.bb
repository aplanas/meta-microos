SUMMARY = "Haskell blaze-builder library development files"
DESCRIPTION = "This package provides the Haskell blaze-builder library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-devel-0.4.2.2-3.6.aarch64.rpm"
RPM_HASH = "fb3c583d8362ad0d347552a2105d60fa8ce189dde50465de5b19892c6aefdee587272b1b57a870ea7fbb219013ee88b491af01ed0c4f98133a8c26e42cd22add"

RPROVIDES:${PN} += "ghc-blaze-builder-devel \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-builder \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-text-2.0.2"

inherit rpm
