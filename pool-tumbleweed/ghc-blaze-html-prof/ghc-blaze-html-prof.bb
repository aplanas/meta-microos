SUMMARY = "Haskell blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-prof-0.9.1.2-9.1.aarch64.rpm"
RPM_HASH = "53c03911294d74ab388054e20d3491cb29ddbad4ab5c50f99336cbde75a266ae9691475f8ed5ebf41669f786ae00e3469f26d58050ded8c82a160861f86766b0"

RPROVIDES:${PN} += "ghc-blaze-html-prof \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR"

RDEPENDS:${PN} += "ghc-blaze-html-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
