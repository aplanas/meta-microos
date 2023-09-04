SUMMARY = "Haskell unliftio library documentation"
DESCRIPTION = "This package provides the Haskell unliftio library documentation."
LICENSE = "MIT"

PV = "0.2.25.0"

RPM_NAME = "ghc-unliftio-doc-0.2.25.0-1.7.noarch.rpm"
RPM_HASH = "6e7e6156dd60809ef3ace5ad65542c31a5f3f2b017afab29e041eb8ac1074d9944e3c8890e83efbb7876df47857de82adc079f662e7718adc7e6893af147b29a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unliftio-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
