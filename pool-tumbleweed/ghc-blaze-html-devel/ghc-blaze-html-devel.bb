SUMMARY = "Haskell blaze-html library development files"
DESCRIPTION = "This package provides the Haskell blaze-html library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-devel-0.9.1.2-9.1.aarch64.rpm"
RPM_HASH = "d2af7f948edcd4cbb4a3a3332b60bd65ec9b5e262110ccf1ff7a862a46b545e8fdb2ac16a3e48ea338945e83b4cd6401e1f4ede1e566fb2d9677c2e48bad1e1c"

RPROVIDES:${PN} += "ghc-blaze-html-devel \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-html \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2"

inherit rpm
