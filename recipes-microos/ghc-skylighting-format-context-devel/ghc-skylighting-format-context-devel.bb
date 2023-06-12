SUMMARY = "Haskell skylighting-format-context library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-devel-0.1.0.2-1.3.aarch64.rpm"
RPM_HASH = "be9be02abfa9d8710b85e8668683a83808135b381ff100dc77838d38368a887ee0aaf48a6c8abdae5bda7fa43aea64b58c7b178b4ae443b423c1d9f55c09e238"

RPROVIDES:${PN} += "ghc-devel(skylighting-format-context-0.1.0.2-KUO5o5IaP468SqsY1Sf1SB) \
ghc-skylighting-format-context-devel \
ghc-skylighting-format-context-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63) \
ghc-devel(text-2.0.2) \
ghc-skylighting-format-context"

inherit rpm
