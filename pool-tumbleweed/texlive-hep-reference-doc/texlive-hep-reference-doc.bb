SUMMARY = "Documentation for texlive-hep-reference"
DESCRIPTION = "This package includes the documentation for texlive-hep-reference"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64853"

RPM_NAME = "texlive-hep-reference-doc-2023.209.1.1svn64853-54.2.noarch.rpm"
RPM_HASH = "577e4b793c9e5fbc8f5196d71e039c65380c3028eeb94fbac229b777935cc2051c7ff5706dd0b480f31d6ae0b6093dda67c1b810b603e8b739ec648b573a0c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-reference-doc"

RDEPENDS:${PN} += ""

inherit rpm
