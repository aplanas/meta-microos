SUMMARY = "Haskell blaze-builder library development files"
DESCRIPTION = "This package provides the Haskell blaze-builder library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-devel-0.4.2.2-3.3.aarch64.rpm"
RPM_HASH = "f5ae7d9bbd3bb5cd9b04dfb990e1d672c2bfefa13571700ee7d651f7f4a1d9b1c41027c74f8f70634c2a49ed243754923f35fbaa7dfdbf5d33c280f4e33cc265"

RPROVIDES:${PN} += "ghc-blaze-builder-devel \
ghc-blaze-builder-devel(aarch-64) \
ghc-devel(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW)"
RDEPENDS:${PN} += "/bin/sh \
ghc-blaze-builder \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(text-2.0.2)"

inherit rpm
