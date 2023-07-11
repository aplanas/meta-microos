SUMMARY = "Haskell hscolour library documentation"
DESCRIPTION = "This package provides the Haskell hscolour library documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-doc-1.24.4-4.6.noarch.rpm"
RPM_HASH = "05e4342d422ffc8283c66e87372cdfdc62d335d8ab5ae0e4f2f1386debcfeaa01b87b574af86c7685da15498267b2f7bdb02e88825482ba92c9fa94b8152b7be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hscolour-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
