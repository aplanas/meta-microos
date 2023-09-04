SUMMARY = "Haskell foldable1-classes-compat library documentation"
DESCRIPTION = "This package provides the Haskell foldable1-classes-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-foldable1-classes-compat-doc-0.1-2.2.noarch.rpm"
RPM_HASH = "ced9bfb047146920b1116defaf254ecfd7998591d7d1f04b59a1c575809f0430db7f6464126d4f1b9973dfa35a8c0c202612c2af721b89828e95d33fd54a2485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-foldable1-classes-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
