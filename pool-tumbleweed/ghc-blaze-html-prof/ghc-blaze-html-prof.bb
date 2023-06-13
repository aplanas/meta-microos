SUMMARY = "Haskell blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-prof-0.9.1.2-8.3.aarch64.rpm"
RPM_HASH = "186e45b925a92d366aefc0b2c2b8ac91f5c4987ee3ceffd320a3ed3fea6056d3c5b58062477fd2d22d7904c8ecad9249619a6c3485a34b72a7be835416c3c841"

RPROVIDES:${PN} += "ghc-blaze-html-prof \
ghc-blaze-html-prof(aarch-64) \
ghc-prof(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR)"

RDEPENDS:${PN} += "ghc-blaze-html-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) \
ghc-prof(blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(text-2.0.2)"

inherit rpm
