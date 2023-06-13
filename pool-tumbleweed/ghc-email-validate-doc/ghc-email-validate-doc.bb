SUMMARY = "Haskell email-validate library documentation"
DESCRIPTION = "This package provides the Haskell email-validate library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.3.2.18"

RPM_NAME = "ghc-email-validate-doc-2.3.2.18-2.2.noarch.rpm"
RPM_HASH = "53dedecb125868c92467844b3f9c973cd7d3c724627167fd52d0bfdb6b4c6e09979303eec686fa9b0886ef31d37fa29cec469163dd7948f39ce1eed49844fbab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-email-validate-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
