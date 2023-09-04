SUMMARY = "Haskell iproute library documentation"
DESCRIPTION = "This package provides the Haskell iproute library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-doc-1.7.12-2.9.noarch.rpm"
RPM_HASH = "4fec35864501717ba60c8636ad797424dee7a76c596156e2dfc5cbac3b233e12cdd7cb989a743dea6c2b444ed402892771660d6daeaba5d2d5ba8786aff0a480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-iproute-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
