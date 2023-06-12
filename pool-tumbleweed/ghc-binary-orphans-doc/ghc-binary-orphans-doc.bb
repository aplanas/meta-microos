SUMMARY = "Haskell binary-orphans library documentation"
DESCRIPTION = "This package provides the Haskell binary-orphans library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.4.1"

RPM_NAME = "ghc-binary-orphans-doc-1.0.4.1-1.2.noarch.rpm"
RPM_HASH = "13ea71483071f403b414333137caec845ae9a92a73bb251aac545ec2c09b6cc524176e24636e02ba14419e33d983a3834be4b525eaceb9b775f04df874e244b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-binary-orphans-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
