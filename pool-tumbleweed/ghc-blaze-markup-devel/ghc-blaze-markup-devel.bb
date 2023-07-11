SUMMARY = "Haskell blaze-markup library development files"
DESCRIPTION = "This package provides the Haskell blaze-markup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-devel-0.8.2.8-5.6.aarch64.rpm"
RPM_HASH = "3003f6b6c464fc8d28280c48cbd24eaadedc699d9def3610a4d696e961d6a797f6c668e0b53a496b130475d3b83420e931e322ff6371ea260145debcf09cfac2"

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
