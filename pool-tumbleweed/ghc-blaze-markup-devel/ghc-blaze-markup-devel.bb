SUMMARY = "Haskell blaze-markup library development files"
DESCRIPTION = "This package provides the Haskell blaze-markup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-devel-0.8.2.8-6.1.aarch64.rpm"
RPM_HASH = "530d40511d75ad91e070383c9634d54a266a40e38f5486a9601d8d6792dfa7981c07010bd04fdfdba0add23ae881350d6e0c036089575955d06bce8de83dd086"

RPROVIDES:${PN} += "ghc-blaze-markup-devel \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-markup \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2"

inherit rpm
