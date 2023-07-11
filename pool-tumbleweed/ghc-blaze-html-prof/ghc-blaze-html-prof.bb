SUMMARY = "Haskell blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-prof-0.9.1.2-8.6.aarch64.rpm"
RPM_HASH = "e629d4a4c7c10aa08d013629910decff740895e1837ae9c43803d841506dc4d101519e4ac2365f519c7801d696f9c8905f4a80acda565a76c1b27594ef025c77"

RPROVIDES:${PN} += "ghc-blaze-html-prof \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR"

RDEPENDS:${PN} += "ghc-blaze-html-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
