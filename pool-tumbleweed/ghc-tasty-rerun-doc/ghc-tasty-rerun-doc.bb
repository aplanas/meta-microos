SUMMARY = "Haskell tasty-rerun library documentation"
DESCRIPTION = "This package provides the Haskell tasty-rerun library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-doc-1.1.18-6.5.noarch.rpm"
RPM_HASH = "e551e96b562257dfce2c1fbaa1793b6a49dc0d5102114929ac2c6e19dec9bdc1581c61d558a210e053565a6b8d2021b01695470040cc3481ad33a81e94218ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-rerun-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
